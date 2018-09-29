(ns QuickSort)

(defn get-smaller [items x]
  (cond (empty? items) '()
        (> x (first items)) (concat (list (first items)) (get-smaller (rest items) x))
        :else (get-smaller (rest items) x)))

(defn get-larger [items x]
  (cond (empty? items) '()
        (< x (first items)) (concat (list (first items)) (get-larger (rest items) x))
        :else (get-larger (rest items) x)))

(defn quick-sort [items]
  (let [left-itmes (get-smaller items (first items))]
    (let [right-items (get-larger items (first items))]
      (cond (empty? left-itmes) (concat (list (first items)) right-items)
            (empty? right-items) (concat left-itmes (list (first items)))
            :else (concat (quick-sort left-itmes) (list (first items)) (quick-sort right-items))))))

(println (quick-sort '(77 33 2 98  88 88 3 90 22 75)))
