(ns ^:figwheel-always sidequarter-frontend.api
    (:require-macros [sidequarter-frontend.env :refer [cljs-env]]
                     [cljs.core.async.macros :refer [go]])
    (:require [cljs-http.client :as http]
              [cljs.core.async :refer [<! >! put! chan]]
              [clojure.string :refer [join]]))

(def api-url (cljs-env :api-url))

(defn get-sidekiqs []
  (http/jsonp api-url {:callback-name "callback"}))

(defn stats-path [sidekiq-id]
  (join "/" [api-url sidekiq-id "stats"]))

(defn get-stats [sidekiq-id]
  (let [url (stats-path sidekiq-id)]
    (http/jsonp url {:callback-name "callback"})))
