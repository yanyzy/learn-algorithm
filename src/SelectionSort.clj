(ns SelectionSort)

(defn selection-sort [items]
  (if (empty? items)
    '()
    (cons (apply min  items) (selection-sort (remove #(= (apply min items)  %) items)))))

(println (selection-sort '(3 2 87 4 9 0 7 44 31)))
