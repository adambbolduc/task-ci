(defproject task-ci "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://github.com/adambbolduc/task-ci"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.1"]
                 [ring/ring-defaults "0.2.1"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler task-ci.handler/app}
  :profiles
  {:dev {:plugins [[cider/cider-nrepl "0.13.0-SNAPSHOT"]
                   [refactor-nrepl "2.3.0-SNAPSHOT"]]
         :ring {:port 8080
                :nrepl {:start? true
                        :port 59258}}
         :dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})
