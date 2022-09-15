Challenge 1-3

```clojure
(ns test-clojure-date.devhaus
  (:require
   [clojure.string :as str]))


(defn my-id [sth]
  sth)

(defn my-comp [f g]
  (fn [& args] (f (apply g args))))

(def my-composed-fn (my-comp str/upper-case #(str % " hello!")))

(my-composed-fn "here is something")

;; is id preserved?
;; only tested for one value
(=
 ((my-comp my-id inc) 2)
 ((my-comp inc my-id) 2))
```

4
* associativity: yes
* id: there exists way to link to the page itself
* composition works: linking from A to B and then from B to page C is the same result as linking 
from page A to page C
-> no category

5
* one is not automatically befriended to oneself
* arrows do not compose (if A is friend to B and B is friend to C, A is not friend to C)

6

* when there is an edge for each node that goes to the same node
* when for all nodes the following holds: if there is an edge from node A to node B and there is an edge from node B to node c  then it is equivalent to an edge from A to B
* should not be weighed
