(ns hello-lambda-jakarta.core
  (:require [cljs.nodejs :as nodejs]))

(def os (nodejs/require "os"))
(def process (nodejs/require "process"))

(defn uname []
  {:platform (.platform os)
   :arch (.arch os)})

(defn whoami []
  (.-USER process/env))

(defn free []
  (str "free mem: " (.freemem os) " bytes"))