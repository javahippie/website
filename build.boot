(def project 'tzde)
(def version "0.1.0-SNAPSHOT")

(set-env! :resource-paths #{"resources" "src"}
          :source-paths   #{"test"}
          :dependencies   '[[org.clojure/clojure "RELEASE"]
                            [adzerk/boot-test "RELEASE" :scope "test"]
                            [ring/ring-core "1.6.3"]
                            [ring/ring-jetty-adapter "1.6.3"]
                            [ring/ring-devel "1.6.3"]
                            [compojure "1.6.1"]
                            [rum "0.11.4"]])

(task-options!
 aot {:namespace   #{'tzde.core}}
 pom {:project     project
      :version     version
      :description "My personal website"
      :url         "https://www.tim-zoeller.de"
      :scm         {:url "https://github.com/javahippie/tzde"}
      :license     {"Eclipse Public License"
                    "http://www.eclipse.org/legal/epl-v10.html"}}
 repl {:init-ns    'tzde.core}
 jar {:main        'tzde.core
      :file        (str "tzde-" version "-standalone.jar")})

(deftask build
  "Build the project locally as a JAR."
  [d dir PATH #{str} "the set of directories to write to (target)."]
  (let [dir (if (seq dir) dir #{"target"})]
    (comp (aot) (pom) (uber) (jar) (target :dir dir))))

(deftask dev
  "Run server hot reloading Clojure namespaces"
  [p port PORT int "Server port (default 3000)"]
  (require '[tzde.core :as app])
  (apply (resolve 'app/run-dev-server) [(or port 3000)]))

(require '[adzerk.boot-test :refer [test]])
