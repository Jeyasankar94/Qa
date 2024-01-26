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

        stage('Build') {
            steps {
                script {
                    sh "${MAVEN_HOME}/bin/mvn clean compile"
                }
            }
        }

        stage('Run Tests') {
            steps {
                script {
                    sh "${MAVEN_HOME}/bin/mvn test"
                }
            }
        }
    }

    post {
        always {
            emailext attachLog: true,
                body: 'Test execution ${BUILD_STATUS}',
                subject: 'Test Execution - ${BUILD_STATUS}',
                to: 'jeyasankar94cse@gmail.com'
        }
    }
}
