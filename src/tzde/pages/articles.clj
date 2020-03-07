(ns tzde.pages.articles
  (:require [rum.core :refer [defc]]
            [java-time :as time]
            [tzde.data.articles :refer [articlelist]]))

(defn format-line [{title :title
                    medium :medium
                    link :link
                    date :date}] 
  [:li 
   [:a {:href link} 
    (format "%s - %s (%s)" (time/format "yyyy-MM-dd" date) title medium)]])

(defc articles []
  [:div
   [:h2 "My published articles"]
   [:ol
    (map format-line articlelist)]])
