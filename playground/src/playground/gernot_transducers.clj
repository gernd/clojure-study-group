(ns playground.gernot-transducers)


(defn first [arg] (println "first"))

(defn second [arg] (println "second"))

(def combined (comp first second))

;; combined equals to (first (second (arg)))

(combined 1)

;; flatten works recursively
;; mapcat only processes the first level of nesting


