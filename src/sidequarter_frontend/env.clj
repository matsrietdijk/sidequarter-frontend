(ns ^:figwheel-always sidequarter-frontend.env
  (:require [environ.core :refer [env]]))

(defmacro cljs-env [key]
  (env key))
