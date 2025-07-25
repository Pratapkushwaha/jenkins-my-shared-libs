def call(){
  sh "trivy fs . -O results.json"
}
