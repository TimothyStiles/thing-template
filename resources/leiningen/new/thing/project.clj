(defproject {{raw-name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Apache Software License"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [thi.ng/geom "0.0.1050"]]
  :main ^:skip-aot {{namespace}}
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
