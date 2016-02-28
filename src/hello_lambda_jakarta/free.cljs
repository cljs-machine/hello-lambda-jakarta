(ns hello_lambda_jakarta.free
  (:require [cljs.nodejs :as nodejs]
            [hello-lambda-jakarta.core :as ljlib]))

(nodejs/enable-util-print!)

(defn -main []
  (println (ljlib/free)))

(set! *main-cli-fn* -main)