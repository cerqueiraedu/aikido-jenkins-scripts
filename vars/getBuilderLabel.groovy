#!/usr/bin/groovy

/**
 * Returns name kubernetes will name the pod that used while executing the pipeline.
 * @return
 */
def call() {
    return "ephemeral-builder-${UUID.randomUUID().toString()}"
}