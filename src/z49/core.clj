(ns z49.core
    (:require [clj-http.client :as client])
    (:use seesaw.core))

(native!)

(def input-box
  (text))

(def tab
  (top-bottom-split
    "view"
    input-box
    :divider-location 2/3))

(def layout-main
  (left-right-split
    "tabs"
    tab
    :divider-location 1/3))

(def mainframe (frame :title "z49"
                      :size [300 :by 200]
                      :content layout-main
                      :on-close :exit))

(defn -main [& args]
  (invoke-later
   (-> mainframe
       ;pack!
       show!)))
