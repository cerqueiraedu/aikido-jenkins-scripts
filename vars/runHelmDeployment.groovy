#!/usr/bin/groovy

/**
 * 
 * @param 
 * @return
 */
def call(String chartRepo, String namespace, String releasePrefix, String appName, String imageVersion) {
    try {
        sh "helm init --client-only --skip-refresh"
        sh "helm repo add ${chartRepo} https://cerqueiraedu.github.io/${chartRepo}/charts"
        sh "helm upgrade --install --namespace ${namespace} --wait ${releasePrefix}-${appName} ${chartRepo}/${appName} --set image.tag=${imageVersion}"
    }
    catch(ex){
        throw ex
    }
}

