(ns InsertionSort)


;未完待续

(defn insert-sort [items])

(defn insert-sort' [x items]
  (cond (empty? items) (list x)
        (< x (last items)) (concat (insert-sort' x (drop-last items)) (list (last items) ))
        :else (concat items (list x))))

(defn get-list [x items]
  (if (= x (first items))
    '()
    (concat (list (first items) )  (get-list x (rest items)))))

(println (get-list 3 '(64 44 99 4 3 22)))

