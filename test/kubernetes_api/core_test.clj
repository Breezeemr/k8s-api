(ns kubernetes-api.core-test
  (:require [clojure.test :refer :all]
            [kubernetes-api.core :as k8s-api]))

;; TODO


(comment

  (def k8s (k8s-api/client "https://localhost" {}))


  ;;(k8s-api/explore k8s :Deployment)


  )
