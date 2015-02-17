(ns z49.core
	(:require [clj-http.client :as client])
    (:use seesaw.core))

(defn -main [& args]
  (invoke-later
    (-> (frame :title "Hello",
           :content "Hello, Seesaw",
           :on-close :exit)
     pack!
     show!)))
