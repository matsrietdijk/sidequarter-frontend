(defproject sidequarter-frontend "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.122"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [environ "1.0.1"]
                 [sablono "0.3.6"]
                 [garden "1.3.0-SNAPSHOT"]
                 [cljs-http "0.1.37"]
                 [org.omcljs/om "0.9.0"]
                 [cljsjs/chartist "0.9.4-0"]]

  :plugins [[lein-cljsbuild "1.1.0"]
            [lein-figwheel "0.4.1"]
            [lein-garden "0.2.6"]
            [lein-environ "1.0.1"]]

  :source-paths ["src/cljs"]

  :clean-targets ^{:protect false} ["resources/public/js/compiled" "target"]

  :garden {:builds [{;; Optional name of the build:
                     :id "screen"
                     ;; Source paths where the stylesheet source code is
                     :source-paths ["src/styles"]
                     ;; The var containing your stylesheet
                     :stylesheet sidequarter-frontend.styles/screen
                     ;; Compiler flags passed to `garden.core/css'
                     :compiler {;; Where to save the file
                                :output-to "resources/public/css/screen.css"
                                ;; Compress output
                                :pretty-print? false}}]}

  :cljsbuild {
    :builds [{:id "dev"
              :source-paths ["src/cljs"]

              :figwheel { :on-jsload "sidequarter-frontend.core/on-js-reload" }

              :compiler {:main sidequarter-frontend.core
                         :asset-path "js/compiled/out"
                         :output-to "resources/public/js/compiled/sidequarter_frontend.js"
                         :output-dir "resources/public/js/compiled/out"
                         :source-map-timestamp true }}
             {:id "min"
              :source-paths ["src/cljs"]
              :compiler {:output-to "resources/public/js/compiled/sidequarter_frontend.js"
                         :main sidequarter-frontend.core
                         :optimizations :advanced
                         :pretty-print false}}]}

  :figwheel {
             ;; :http-server-root "public" ;; default and assumes "resources"
             ;; :server-port 3449 ;; default
             ;; :server-ip "127.0.0.1"

             :css-dirs ["resources/public/css"] ;; watch and update CSS

             ;; Start an nREPL server into the running figwheel process
             ;; :nrepl-port 7888

             ;; Server Ring Handler (optional)
             ;; if you want to embed a ring handler into the figwheel http-kit
             ;; server, this is for simple ring servers, if this
             ;; doesn't work for you just run your own server :)
             ;; :ring-handler hello_world.server/handler

             ;; To be able to open files in your editor from the heads up display
             ;; you will need to put a script on your path.
             ;; that script will have to take a file path and a line number
             ;; ie. in  ~/bin/myfile-opener
             ;; #! /bin/sh
             ;; emacsclient -n +$2 $1
             ;;
             ;; :open-file-command "myfile-opener"

             ;; if you want to disable the REPL
             ;; :repl false

             ;; to configure a different figwheel logfile path
             ;; :server-logfile "tmp/logs/figwheel-logfile.log"
             })
