#!/usr/bin/groovy

/**
 * 
 * @param 
 * @return
 */
def call(String chartRepo, String namespace, String releasePrefix, String appName) {
    try {
        sh "helm init --client-only --skip-refresh"
        sh "helm repo add ${chartRepo} https://cerqueiraedu.github.io/${chartRepo}/charts"
        sh "helm upgrade --install --namespace ${namespace} --wait ${releasePrefix}-${appName} ${chartRepo}/${appName}"
    }
    catch(ex){
        throw ex
    }
}

