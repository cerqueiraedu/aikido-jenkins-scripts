def call(Closure body = null) {
    container('docker-helm') {
        if (body) body()
    }
}