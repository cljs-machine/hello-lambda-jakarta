(ns hello-lambda-jakarta.core
  (:require [cljs.nodejs :as nodejs]
            ))

(def os (nodejs/require "os"))
(def process (nodejs/require "process"))

(nodejs/enable-util-print!)

(defn -main []
  (println "Hello world!")
  ;; call arch method of os module
  (println (.arch os))
  ;; get USER field of env object in process
  (println (.-USER process/env))
  )

(set! *main-cli-fn* -main)
