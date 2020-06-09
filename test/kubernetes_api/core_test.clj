(ns kubernetes-api.core-test
  (:require [clojure.test :refer :all]
            [kubernetes-api.core :as k8s-api]))

;; TODO


(comment


  ;; NOTE you need to run kubectl proxy --expose 8001

  (def k8s (k8s-api/client "http://localhost:8001" {}))


  ;;(k8s-api/explore k8s :Deployment)


  )
