(ns ^:figwheel-always sidequarter-frontend.api
    (:require-macros [sidequarter-frontend.env :refer [cljs-env]]
                     [cljs.core.async.macros :refer [go]])
    (:require [cljs-http.client :as http]
              [cljs.core.async :refer [<! >! put! chan]]))

(def api-url (cljs-env :api-url))

(defn get-sidekiqs []
  (http/jsonp api-url {:callback-name "callback"}))
