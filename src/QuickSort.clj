(ns QuickSort)

(defn get-list [items x y]
  (cond (empty? items) '()
        (= 0 y) (if (> x (first items))
                  (concat (list (first items)) (get-list (rest items) x y))
                  (get-list (rest items) x y))
        :else (if (< x (first items))
                (concat (list (first items)) (get-list (rest items) x y))
                (get-list (rest items) x y))))

(defn quick-sort [items]
  (let [left-itmes (get-list items (first items) 0)]
    (let [right-items (get-list items (first items) 1)]
      (cond (empty? left-itmes) (concat (list (first items)) right-items)
            (empty? right-items) (concat left-itmes (list (first items)))
            :else (concat (quick-sort left-itmes) (list (first items)) (quick-sort right-items))))))

(println (quick-sort '(77 33 2 98 88 88 3 90 22 75)))
