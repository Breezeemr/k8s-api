(ns kubernetes-api.core-test
  (:require [clojure.test :refer :all]
            [kubernetes-api.core :as k8s-api]))

;; TODO


(comment


  ;; NOTE you need to run kubectl proxy --expose 8001


  (def k8s (k8s-api/client "http://localhost:8001" {}))

  (k8s-api/explore k8s)

  ;; try to get the actions for deployments for developemnt
  (k8s-api/request k8s {:kind      :Deployment
                        :action    :list
                        :request {:namespace "development"}})

;; => {:insecure? false,
;;     :method :get,
;;     :url "http://localhost:8001/apis/apps/v1/namespaces/development/deployments",
;;     :as :text,
;;     :headers {"Accept" "application/json"}}

  ;; so request shows if that option is available

  ;; as where invoke calls it

  (k8s-api/invoke k8s {:kind    :Deployment
                       :action  :list
                       :request {:namespace "development"}})
;; => {:kind "DeploymentList",
;;     :apiVersion "apps/v1",
;;     :metadata
;;     {:selfLink "/apis/apps/v1/namespaces/development/deployments",
;;      :resourceVersion "132982624"},
;;     :items
;; "...."



  )
