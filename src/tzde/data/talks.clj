(ns tzde.data.talks
  (:require [java-time :refer [local-date-time]]))

(defn is-in-past? [{date :date}]
 (> 1 (compare date (local-date-time))))

(defn is-in-future? [event]
  (not (is-in-past? event)))



(def talklist [{:title "Web3j - Das Tor zur Blockchain für die Java Welt"
                :date (local-date-time 2018 9 28 11 00)
                :venue "JUG Saxony Day 2018, Dresden"
                :link "https://www.jug-saxony-day.org/2018/wp-content/uploads/JSD2018_Programm.pdf"}
               {:title "Workflow engines with Clojure - It's a match!"
                :date (local-date-time 2019 2 9 0 0)
                :venue ":clojureD 2019, Berlin"
                :link "https://clojured.de/archiv/schedule-2019/#timZoeller"
                :slides "https://speakerdeck.com/javahippie/workflow-engines-with-clojure-its-a-match"
                :video "https://www.youtube.com/watch?v=M1HrLAud6MA&t=1s"}
               {:title "Getting back in the ring! Comparing Eclipse Microprofile to Spring Boot"
                :date (local-date-time 2019 4 2 16 40)
                :venue "microXchg 2019, Berlin"
                :link "http://microxchg.io/2019/index.html"
                :slides "https://speakerdeck.com/javahippie/getting-back-in-the-ring-comparing-eclipse-microprofile-to-spring-boot"}
               {:title "Eclipse MicroProfile vs. Spring Boot: getting back in the Ring!"
                :date (local-date-time 2019 5 9 10 00)
                :venue "JAX 2019, Mainz"
                :link "https://jax.de/serverside-enterprise-java/eclipse-microprofile-vs-spring-boot-getting-back-in-the-ring/"
                :slides "https://speakerdeck.com/javahippie/getting-back-in-the-ring-comparing-eclipse-microprofile-to-spring-boot"}
               {:title "Volltextindizierung von Camunda Usertasks mit Engine Plugins"
                :date (local-date-time 2019 9 24 18 00)
                :venue "Camunda Usergroup Rhein-Main"
                :link "https://www.meetup.com/de-DE/Camunda-User-Group-Rhein-Main/events/262620089/"
                :slides "https://speakerdeck.com/javahippie/camunda-process-engine-plugins"}
               {:title "MicroProfile-Implementierungen - welche passt zu mir?"
                :date (local-date-time 2020 03 17 12 00)
                :venue "JavaLand 2020, Brühl"
                :link "https://programm.javaland.eu/2020/#/scheduledEvent/590520"}
               {:title "Get it all! Alle MicroProfile Features unter einer Stunde gezeigt"
                 :date (local-date-time 2020 05 12 18 15)
                 :venue "JAX 2020, Mainz"
                 :link "https://jax.de/serverside-enterprise-java/get-it-all-alle-microprofile-features-unter-einer-stunde-gezeigt/"}
               {:title "Eclipse Microprofile GraphQL - APIs abseits von REST"
                :date (local-date-time 2020 05 13 17 00)
                :venue "MD DevDays, Magdeburg"
                :link "https://www.md-devdays.de/Act?id=1000209"}])
