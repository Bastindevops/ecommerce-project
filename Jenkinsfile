pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

      stage('Docker Build') {
    steps {
        dir('order-service') {
            bat 'docker build -t devop93/order-service:v1 .'
        }
    }
}

stage('Docker Build') {
    steps {
        dir('order-service') {
            bat 'docker build -t yourdockerhubusername/order-service:v1 .'
        }
    }
}

        stage('Docker Login') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'dockerhub',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS'
                )]) {
                    bat 'echo %DOCKER_PASS% | docker login -u %DOCKER_USER% --password-stdin'
                }
            }
        }

        stage('Docker Push') {
            steps {
                bat 'docker push devop93/order-service:v1'
            }
        }
    }
}
