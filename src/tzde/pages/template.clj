(ns tzde.pages.template
  (:require [rum.core :refer [defc]]
            [tzde.pages.index :refer [index]]
            [tzde.pages.error :refer [error]]))

(def nav [{:uri "/"
           :label "Home"
           :component index}
          {:uri "/talks"
           :label "Talks (TBD)"
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
            :href "/main.css"}]]
   [:body 
    [:div 
     (header) 
     [:div {:class "body"}
      (body)] 
     (footer)]]])
