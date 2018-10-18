

def call(String commitHash) {
    return sh (
        script: "git tag --contains ${commitHash}",
        returnStdout: true
    ).trim()
}