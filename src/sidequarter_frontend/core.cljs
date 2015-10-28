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
  (om/component
   (dom/ul #js {:className "sidekiq-stats"}
           (dom/li nil (str "Busy: " (data :busy)))
           (dom/li nil (str "Enqueued: " (data :enqueued)))
           (dom/li nil (str "Scheduled: " (data :scheduled)))
           (dom/li nil (str "Retries: " (data :retries)))
           (dom/li nil (str "Failed: " (data :failed)))
           (dom/li nil (str "Processed: " (data :processed))))))

(defn sidekiq-view [data owner]
  (reify
    om/IWillMount
    (will-mount [_]
      (go
        (let [response ((<! (api/get-stats (data :id))) :body)
              stats (:stats response)]
          (om/update! data [:stats] stats))))
    om/IRender
    (render [_]
      (dom/div #js {:className "sidekiq" :id (data :id)}
               (dom/h3 nil (data :application))
               (dom/p nil (data :namespace))
               (dom/p nil (data :redis_url))
               (om/build sidekiq-stats-view (get data :stats {}))))))

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
      (dom/h1 nil "Sidekiqs")
      (om/build sidekiq-list data))))

(om/root
  (fn [data owner]
    (reify om/IRender
      (render [_]
        (dom/div nil (om/build sidekiq-box data)))))
  app-state
  {:target (. js/document (getElementById "app"))})


(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
