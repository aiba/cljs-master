(ns fn-test.core)

(defn ^:export foo [a b] (conj a b))

(defn ^:export bar
  ([a b] (vector a b))
  ([a b c] (vector a b c)))

(defn ^:export baz []
  (.log js/console (foo [] 'a))
  (.log js/console (bar :foo :bar :baz)))
