pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

       stage('Build') {
    steps {
        dir('order-service') {
            sh 'mvn clean package'
        }
    }
}

stage('Docker Build') {
    steps {
        dir('order-service') {
            sh 'docker build -t yourdockerhubusername/order-service:v1 .'
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
                    sh 'echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin'
                }
            }
        }

        stage('Docker Push') {
            steps {
                sh 'docker push yourdockerhubusername/order-service:v1'
            }
        }
    }
}
