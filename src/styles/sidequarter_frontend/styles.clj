(ns sidequarter-frontend.styles
  (:require [garden.def :refer [defstylesheet defstyles defrule]]
            [garden.units :refer [px]]))

(defrule horizontal-list :ul.h-list)

(defstyles screen
  (horizontal-list
   {:list-style-type "none"
    :margin 0
    :padding 0}
   [:li
    {:display "inline"
     :margin-right (px 10)}])
  [[:body
    {:background-color "#00bcd4"}]
   [:.sidekiq-list
    [:.sidekiq
     {:background-color "#fff"}]]])
