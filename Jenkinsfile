pipeline {
    agent any
    stages {
        stage('build') {
            steps {
               
                    // Optionally use a Maven environment you've configured already
              
                        sh 'mvn clean compile test'
                    
                
            }
        }
    }
}
