(ns tzde.pages.talks
  (:require [rum.core :refer [defc]]
            [java-time :as time]
            [tzde.data.talks :refer [talklist]]
            [tzde.dateutil :refer [is-in-future? is-in-past?]]))

(defn build-row [{title :title
                  date :date
                  venue :venue
                  link :link
                  slides :slides}]
  [:tr
   [:td (time/format "dd.MM.yyyy HH:mm" date)]
   [:td title]
   [:td [:a {:href link} venue]]
   (if (nil? slides) [:td "-"] [:td [:a {:href slides} "Slides"]])])

(defn build-table [talks]
[:table {:class "talk-table"}
    [:tbody
     [:tr
      [:th "Date"]
      [:th "Topic"]
      [:th "Venue"]
      [:th "Slides"]]
     (map build-row talks)]])

(defc talks []
  [:div
   [:h2 "Check out my upcoming talks!"]
   (build-table (filter is-in-future? talklist))
   [:h2 "Here are my talks from the past"]
   (build-table (filter is-in-past? talklist))])
