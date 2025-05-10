(ns testjump.core
  (:gen-class))

(defn -main
  [& args]
  (println (java.lang.String/valueOf 999))
  (println "Hello" (com.nowhere.Test/message)))
