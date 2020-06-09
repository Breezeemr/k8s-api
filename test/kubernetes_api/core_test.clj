(ns kubernetes-api.core-test
  (:require [clojure.test :refer :all]
            [kubernetes-api.core :as k8s-api]))

;; TODO


(comment

  ;;I expect this to create a client if i have kubectl proxy running but it doesn't
  (def k8s (k8s-api/client "http://localhost:8001/api/" {}))


  ;;(k8s-api/explore k8s :Deployment)


  )
