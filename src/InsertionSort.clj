(ns InsertionSort)

(defn insert-sort [items]
  (letfn [
          (insert-item' [items x]
            (cond (empty? items) (list x)
                  (< x (first items)) (concat (list x) items)
                  :else (cons (first items) (insert-item' (rest items) x))))

          (insert-sort' [newItems items]
            (if (empty? items) newItems
                               (insert-sort' (insert-item' newItems (first items)) (rest items))))]
    (insert-sort' (list (first items)) (rest items))))

(println (insert-sort '(64 44 99 4 3 22)))


