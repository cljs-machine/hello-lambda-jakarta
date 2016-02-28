(ns whoami.core
  (:require [cljs.nodejs :as nodejs]
            [hello-lambda-jakarta.core :as core]
            ))

(nodejs/enable-util-print!)

(defn -main []
  (println (core/whoami))
)

(set! *main-cli-fn* -main)
