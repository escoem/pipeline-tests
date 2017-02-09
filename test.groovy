#!groovy 
def build() { 
  stage('Build') { 
    sh "mvn clean compile" 
// } 
} 
return this
