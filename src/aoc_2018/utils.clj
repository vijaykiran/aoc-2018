(ns aoc-2018.utils
  (:require [clojure.string :as str]))

(defn split-trim [s]
  (map str/trim (str/split s #"\n")))
