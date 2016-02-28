(ns whoami.core
  (:require [cljs.nodejs :as nodejs]
            [hello-lambda-jakarta.core :as ljlib]
            ))

(nodejs/enable-util-print!)

(defn -main []
  (println (ljlib/whoami))
)

(set! *main-cli-fn* -main)
