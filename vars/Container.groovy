def call(String project, String hubUser) {
  sh "docker run -d  -p 8081:8080  ${hubUser}/${project}:${ImageTag}"
  sh "docker run -d  -p 8082:8080  ${hubUser}/${project}:latest"
}
