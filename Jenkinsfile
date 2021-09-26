pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                withSonarQubeEnv('sonarqube') {
                    // Optionally use a Maven environment you've configured already
                    withMaven(maven:'maven_3_6_3') {
                        sh 'mvn clean compile -X sonar:sonar -Dsonar.host.url=http://172.17.0.3:9000 -Dsonar.login=5682bc7cd69297cc93d32345d4760c472f2c996b'
                    }
                }
            }
        }
    }
}
