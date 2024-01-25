pipeline {
    agent any
    
    environment {
        MAVEN_HOME = tool 'Maven'
        JAVA_HOME = tool 'JDK11'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Run Selenium Tests') {
            steps {
                script {
                    sh "${MAVEN_HOME}/bin/mvn clean test"
                }
            }
        }
    }

    post {
        always {
            emailext attachLog: true,
                body: 'Selenium tests ${BUILD_STATUS}',
                subject: 'Selenium Test Execution - ${BUILD_STATUS}',
                to: 'jeyasankar94cse@gmail.com'
        }
    }
}
