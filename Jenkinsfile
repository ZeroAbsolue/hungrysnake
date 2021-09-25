pipeline {
    agent any
    stages {
        stage('build') {
            steps {
               withSonarQubeEnv('sonarqube') {
                    // Optionally use a Maven environment you've configured already
                withMaven(maven:'maven_3_6_3') {
                        sh 'mvn clean compile test'
                         
            }
              }  
            }
        }
    }
}
