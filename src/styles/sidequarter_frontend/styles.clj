(ns sidequarter-frontend.styles
  (:require [garden.def :refer [defstylesheet defstyles defrule]]
            [garden.units :refer [px pc]]))

(defrule horizontal-list :ul.h-list)

(defstyles screen
  (horizontal-list
   {:list-style-type "none"
    :margin 0
    :padding 0}
   [:li
    {:display "inline"
     :margin-right (px 10)}])
  [[:.filler
    {:background-color "#FAFAFA"}]
   [:#app
    {:position "relative"
     :z-index 5}]
   [:.hover
    {:position "relative"
     :top (px -120)
     :background-color "#FFFFFF"}]
   [:.header
    {:background-color "#00BCD4"
     :top 0
     :z-index 1
     :height (px 240)
     :width (pc 100)}]
   [:.sidekiq-list
    {:padding [[0 (px 20)]]
     :overflow "hidden"}]])
