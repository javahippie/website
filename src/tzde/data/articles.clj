(ns tzde.data.articles
  (:require [java-time :refer [local-date]]))

(def articlelist [{:title "Web3j – Transaktionen für die Ewigkeit"
                   :medium "Java Magazin 04.2019"
                   :date (local-date 2019 03 01)
                   :link "https://entwickler.de/leseproben/web3j-transaktionen-fuer-die-ewigkeit-579882057.html"}
                  {:title "web3j – das Tor zur Blockchain für die Java-Welt"
                   :medium "Java aktuell 05/2019"
                   :date (local-date 2019 10 01)
                   :link "https://www.doag.org/formes/pubfiles/11591336/05_2019-Java_aktuell-Tim_Zoeller-web3j_das_Tor_zur_Blockchain_fuer_die_Java_Welt.pdf"}
                  {:title "Textblöcke in Java 13: Warum sich das lange Warten gelohnt hat"
                   :medium "Java Magazin 10.19, jaxenter.de"
                   :date (local-date 2019 10 06)
                   :link "https://jaxenter.de/java-13-text-blocks-87055"}
                  {:title "Java 13 - why text blocks are worth the wait"
                   :medium "jaxenter.com"
                   :date (local-date 2019 10 17)
                   :link "https://jaxenter.com/java-13-text-blocks-162278.html"}
                  {:title "Konkurrenz belebt das Geschäft - Runtimes im Überblick"
                   :medium "Java Magazin 03.2020, jaxenter.de"
                   :date (local-date 2020 02 01)
                   :link "https://jaxenter.de/konkurrenz-belebt-das-geschaeft-runtimes-im-ueberblick-92084"}])
