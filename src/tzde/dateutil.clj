(ns tzde.dateutil
  (:require [java-time :refer [local-date-time]]))

(defn is-in-past? [{date :date}]
 (> 1 (compare date (local-date-time))))

(defn is-in-future? [event]
  (not (is-in-past? event)))
