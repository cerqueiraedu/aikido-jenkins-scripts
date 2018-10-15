#!/usr/bin/groovy

/**
 * 
 * @param 
 * @return
 */
def call(String appName, String testResultsPath) {
    try {
        sh "docker volume create test-results"
        sh "mkdir '${testResultsPath}'"
        sh "docker run --name ${appName}-test-runner -v test-results:/build ecerqueira/${appName} npm run test-jenkins"
        sh "docker cp ${appName}-test-runner:/build/test-results.xml '${testResultsPath}/test-results.xml'"
    }
    catch(ex){
        throw ex
    }
    finally {
        sh "docker rm ${appName}-test-runner"
    }
}

