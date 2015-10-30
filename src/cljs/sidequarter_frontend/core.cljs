(ns ^:figwheel-always sidequarter-frontend.core
    (:require-macros [cljs.core.async.macros :refer [go]])
    (:require[om.core :as om :include-macros true]
             [om.dom :as dom :include-macros true]
             [cljs.core.async :refer [<!]]
             [sidequarter-frontend.api :as api]))

(enable-console-print!)

(println "Edits to this text should show up in your developer console.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {}))

(defn sidekiq-stats-view [data owner]
  (reify
    om/IInitState
    (init-state [_]
      {:stats {}})
    om/IWillMount
    (will-mount [_]
      (go
        (let [response ((<! (api/get-stats (data :id))) :body)
              stats (:stats response)]
          (om/set-state! owner :stats stats))))
    om/IRenderState
    (render-state [_ {:keys [stats]}]
      (dom/ul #js {:className "sidekiq-stats h-list"}
              (dom/li nil (str "Busy: " (stats :busy)))
              (dom/li nil (str "Enqueued: " (stats :enqueued)))
              (dom/li nil (str "Scheduled: " (stats :scheduled)))
              (dom/li nil (str "Retries: " (stats :retries)))
              (dom/li nil (str "Failed: " (stats :failed)))
              (dom/li nil (str "Processed: " (stats :processed)))))))

(defn sidekiq-redis-view [data owner]
  (om/component
   (dom/ul #js {:className "sidekiq-redis-info"}
           (dom/li nil
                   (dom/strong nil "Namespace: ")
                   (dom/span nil (data :namespace)))
           (dom/li nil
                   (dom/strong nil "Redis URL: ")
                   (dom/span nil (data :redis_url))))))

(defn sidekiq-read-more [data owner]
  (om/component
   (dom/a #js {:className "sidekiq-read-more" :id (data :id)}
          (dom/i #js {:className "material-icons"} "expand_more"))))

(defn sidekiq-view [data owner]
  (reify
    om/IRender
    (render [_]
      (dom/div #js {:className "sidekiq col s12" :id (data :id)}
               (dom/div #js {:className "row"}
                        (dom/div #js {:className (str "connectivity " (if (data :available) "green" "red"))})
                        (dom/div #js {:className "col s12"}
                                 (dom/h5 nil (data :application)))
                        (dom/div #js {:className "col s4"}
                                 (om/build sidekiq-redis-view data))
                        (dom/div #js {:className "col s11"}
                                 (om/build sidekiq-stats-view data))
                        (dom/div #js {:className "col s1"}
                                 (om/build sidekiq-read-more data)))))))

(defn sidekiq-list [data owner]
  (om/component
   (apply dom/div #js {:className "sidekiq-list"}
          (om/build-all sidekiq-view (:sidekiqs data)))))

(defn sidekiq-box [data owner]
  (reify
    om/IWillMount
    (will-mount [_]
      (om/transact! data [:sidekiqs] (fn [] []))
      (go
        (let [response ((<! (api/get-sidekiqs)) :body)]
          (om/update! data [:sidekiqs] (:sidekiqs response)))))
    om/IRender
    (render [_]
      (dom/div #js {:className "row"}
               (om/build sidekiq-list data)))))

(om/root
  (fn [data owner]
    (reify om/IRender
      (render [_]
        (dom/div #js {:className "container hover z-depth-2"}
                 (om/build sidekiq-box data)))))
  app-state
  {:target (. js/document (getElementById "app"))})


(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
