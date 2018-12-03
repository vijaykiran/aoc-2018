(ns aoc-2018.three
  (:require [aoc-2018.inputs :as ins]
            [clojure.string :as str]
            [aoc-2018.utils :as utils]))

(defn parse [s]
  (zipmap [:id :x :y :w :h]
          (mapv #(Integer/parseInt %) (re-seq #"\d+" s))))

(def input (map parse ins/three))

(defn mms [in]
  (mapcat
   (fn [{:keys [id x y w h]}]
     (for [x (range x (+ x w))
           y (range y (+ y h))]
       [x y]))
   in))

(defn one []
  (->> input
       mms
       frequencies
       vals
       (filter #(> % 1))
       count))

(defn two []
  (let [nc  (->> input
                 mms
                 frequencies
                 (filter (fn [[xy c]] (= c 1)))
                 (into {}))
        all (map
             (fn [{:keys [id x y w h]}]
               {:id id
                :xys (for [x (range x (+ x w))
                           y (range y (+ y h))]
                       [x y])})
             input)]
    (filter (fn [{:keys [id xys]}]
              (every? (fn [xy] (= 1 (nc xy))) xys)) all)))
