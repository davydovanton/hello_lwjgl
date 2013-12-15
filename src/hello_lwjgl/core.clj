(ns hello-lwjgl.core
  (:require [hello-lwjgl.alpha :as alpha]
            [hello-lwjgl.beta :as beta]
            [hello-lwjgl.gamma :as gamma])
  (:import (org.lwjgl Sys))
  (:gen-class))

;; ======================================================================
(defn -main
  [& args]
  (println "Hello, Lightweight Java Game Library! V" (Sys/getVersion))
  (cond
   (= "alpha" (first args)) (alpha/main)
   (= "beta" (first args)) (beta/main)
   (= "gamma" (first args)) (gamma/main)
   :else (alpha/main)))
