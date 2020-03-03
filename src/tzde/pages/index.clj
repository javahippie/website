(ns tzde.pages.index
  (:require [rum.core :refer [defc]]
            [tzde.data.talks :refer [talklist is-in-future?]]))

(defn next-talk [talks]
  (first (filter is-in-future? talks)))

(defc index []
  [:div
   [:h2 "Java and more"]
   [:h3 "Next public talk"]
   (let [{link :link
          title :title
          venue :venue} (next-talk talklist)]
     [:a {:href link} (str title " - " venue)])])
