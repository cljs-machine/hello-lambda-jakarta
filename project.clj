(defproject hello-lambda-jakarta "0.1.0-SNAPSHOT"
  :description "Lambda Jakarta tooling mini-meetup"
  :url "https://github.com/cljs-machine/hello-lambda-jakarta"

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.7.228"]]

  :npm {
    :dependencies [[source-map-support "0.4.0"]]
  }

  :plugins [[lein-cljsbuild "1.1.2"]
            [lein-npm "0.6.2"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "uname"
              :source-paths ["src"]
              :compiler {
                :output-to "out-uname/uname.js"
                :output-dir "out-uname"
                :target :nodejs
                :optimizations :none
                :source-map true}},
             {:id "whoami"
              :source-paths ["src"]
              :compiler {
                :output-to "out-whoami/whoami.js"
                :output-dir "out-whoami"
                :target :nodejs
                :optimizations :none
                :source-map true}}]})
