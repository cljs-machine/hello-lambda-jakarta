(ns uname.core
  (:require [cljs.nodejs :as nodejs]
            [hello-lambda-jakarta.core :as ljlib]
            ))

(nodejs/enable-util-print!)

(defn -main []
  (println (ljlib/uname))
  )

(set! *main-cli-fn* -main)
