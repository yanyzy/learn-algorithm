(ns BinarySearch)

(defn binary-search [items x]
  ;将所得数组排序
  (let [items' (sort items)]
    (letfn [(binary-search' [items' x]
              (cond (empty? items') -1                      ;未查询到
                    (= x (first (drop (/ (count items') 2) items'))) 1 ;判断与中间元素是否相等
                    :else  (cond (= 1 (count items')) -1
                                 ; 大于中间元素
                                 (> x (first (drop (/ (count items') 2) items')))(binary-search' (drop (/ (count items') 2) items') x)
                                 ; 小于中间元素
                                 :else (binary-search' (take (/ (count items') 2) items') x))))]
      (binary-search' items' x))))

(println (binary-search '(2 5 8 19 40 3) 9))
