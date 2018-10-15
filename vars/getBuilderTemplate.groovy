#!/usr/bin/groovy

/**
 * Returns the pod definition used to build/test pipeline.
 * @return
 */
def call() {
    return libraryResource('pod-templates/docker-builder.yaml')
}
