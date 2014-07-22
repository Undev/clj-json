(defproject clj-json "0.3.2-undev"
  :description "Fast JSON encoding and decoding for Clojure via the Jackson library."
  :url "http://github.com/mmcgrana/clj-json"
  :source-paths ["src/clj"]
  :java-source-paths ["src/jvm"]
  :javac-fork "true"
  :dependencies
    [[org.clojure/clojure "1.2.0"]
     [org.clojure/clojure-contrib "1.2.0"]
     [org.codehaus.jackson/jackson-core-asl "1.8.1"]
     [org.codehaus.jackson/jackson-smile "1.8.1"]]
  :dev-dependencies
    [[org.clojars.mmcgrana/lein-javac "1.2.1"]])
