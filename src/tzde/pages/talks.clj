(ns tzde.pages.talks
  (:require [rum.core :refer [defc]]
            [java-time :refer [local-date-time format]]))

(def talklist [{:title "MicroProfile-Implementierungen - welche passt zu mir?"
                :date (local-date-time 2020 03 17 12 00)
                :venue "JavaLand 2020, Brühl"
                :link "https://programm.javaland.eu/2020/#/scheduledEvent/590520"
                :slides ""}
               {:title "Get it all! Alle MicroProfile Features unter einer Stunde gezeigt"
                 :date (local-date-time 2020 05 12 18 15)
                 :venue "JAX 2020, Mainz"
                 :link "https://jax.de/serverside-enterprise-java/get-it-all-alle-microprofile-features-unter-einer-stunde-gezeigt/"
                 :slides "https://google.com"}
               {:title "Eclipse Microprofile GraphQL - APIs abseits von REST"
                :date (local-date-time 2020 05 13 17 00)
                :venue "AMO Kulturhaus, Magdeburg"
                :link "https://www.md-devdays.de/Act?id=1000209"
                :slides ""}])

(defn build-row [{title :title
                  date :date
                  venue :venue
                  link :link
                  slides :slides}]
  [:tr
   [:td (format "dd.MM.yyyy HH:mm" date)]
   [:td title]
   [:td [:a {:href link} venue]]
   [:td [:a {:href slides} "Slides"]]])

(defc talks []
  [:div
   [:h2 "Check out my awesome talks!"]
   [:table {:class "talk-table"}
    [:tbody
     [:tr
      [:th "Date"]
      [:th "Topic"]
      [:th "Venue"]
      [:th "Slides"]]
     (map build-row talklist)]]])
