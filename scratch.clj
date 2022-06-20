;; just a random code kata from our first session on exercism

(ns test-clojure-date.core
  (:gen-class)
  (:require [clojure.tools.trace :refer :all])
  )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


(def hey "greeting")

(deftrace strings->tuples
  [first-string second-string]
  (map (fn [f s] (list f s)) first-string second-string)
  )

(deftrace compute-difference-score
  [[first-char second-char]]
  (if (= first-char second-char)
    0
    1))

(deftrace combine-difference-score
  [acc char-tuple]
  (+ acc (compute-difference-score char-tuple)))

(deftrace compute-hamming-distance
  [first-string second-string]
  (if (not (=
            (count first-string)
            (count second-string)))
    nil
    (->> (strings->tuples first-string second-string)
         (reduce  combine-difference-score 0)
         )))


(comment ->>
         an-array
         (map str)
         (reduce (fn [first-string second-string] (str first-string " " second-string)))
         )
