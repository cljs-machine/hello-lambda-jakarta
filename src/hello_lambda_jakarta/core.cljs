(ns hello-lambda-jakarta.core
  (:require [cljs.nodejs :as nodejs]
            ))

(def os (nodejs/require "os"))
(def process (nodejs/require "process"))

(defn uname []
  (.arch os)
)

(defn whoami []
  (.-USER process/env)
)
