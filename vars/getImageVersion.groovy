#!/usr/bin/groovy

/**
 * Returns the current build's numer as version/tag in order to push the resulting image to docker registry.
 * @param major Major version number of this build. Minor is defaulted as current build's number
 * @return
 */
def call(String major) {
    return "${major}.${env.BUILD_NUMBER}"
}
