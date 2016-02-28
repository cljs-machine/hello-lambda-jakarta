(defproject hello-lambda-jakarta "0.1.0-SNAPSHOT"
  :description "Lambda Jakarta tooling mini-meetup"
  :url "https://github.com/cljs-machine/hello-lambda-jakarta"
  :license {:name "Apache-2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.7.228"]]

  :npm {
    :dependencies [[source-map-support "0.4.0"]]
    :package
      {:bin
       {:lj-uname  "run-uname.js",
        :lj-whoami "run-whoami.js"},
       :scripts
        {:uname  "./run-uname.js",
         :whoami "./run-whoami.js"},
       :private true}
  }

  :plugins [[lein-cljsbuild "1.1.2"]
            [lein-npm "0.6.2"]
           ]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "hello-lambda-jakarta"
              :source-paths ["src"]
              :compiler {
                :output-to "out/hello_lambda_jakarta.js"
                :output-dir "out"
                :target :nodejs
                :optimizations :none
                :source-map true}}]})
