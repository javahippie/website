(ns tzde.core
 (:require [compojure.core :refer [routes GET]]
           [compojure.route :as route]
           [ring.adapter.jetty :refer [run-jetty]]
           [ring.middleware.reload :refer [wrap-reload]]
           [tzde.pages.template :as template]
           [rum.core :refer [render-html]])
  (:gen-class))

(def handler
  (apply routes (conj (map (fn [{uri :uri 
                                 component :component}] 
                             (GET uri [] (render-html (template/template component)))) 
                           template/nav)
                      (route/resources "/"))))

(defn run-dev-server
  [port]
  (run-jetty (wrap-reload #'handler) 
             {:port port}))
