(ns tzde.pages.template
  (:require [rum.core :refer [defc]]
            [tzde.pages.index :refer [index]]
            [tzde.pages.error :refer [error]]
            [tzde.pages.talks :refer [talks]]))

(def nav [{:uri "/"
           :label "Home"
           :component index}
          {:uri "/talks"
           :label "Talks"
           :component talks}
          {:uri "/articles"
           :label "Articles (TBD)"
           :component error}])

(defc menu []
  [:ol
   {:class "menu"}
   (map (fn [{label :label 
              href :uri}] 
          [:li 
           [:a {:href href 
                :class "menu-link"}
            label]]) 
        nav)])

(defc header []
  [:div
   {:class "header"}
   [:h1 "Tim Zöller"]
   (menu)])

(defc footer []
  [:div
   {:class "footer"}
   [:p "Diesen Text hier muss ich aus rechtlichen Gründen anzeigen :("]])

(defc template [body]
  [:html
   [:head
    [:title "Tim Zöller"]
    [:link {:rel "stylesheet" 
            :href "/main.css"}]
    [:link {:rel "stylesheet" 
            :href "https://fonts.googleapis.com/css?family=Open+Sans|Quicksand&display=swap"}]]
   [:body 
    [:div {:class "container"}
     (header) 
     [:div {:class "body"}
      (body)] 
     (footer)]]])
