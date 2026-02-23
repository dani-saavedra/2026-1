pipeline {
    agent any

    environment {
        IMAGE_NAME = "danielsabana/vaca"
        REGISTRY = "https://index.docker.io/v1/"
        TAG = "${env.BUILD_NUMBER}"
    }

    stages {

        stage('Clone Repository') {
            steps {
                checkout scm
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    dockerImage = docker.build("${IMAGE_NAME}:${TAG}")
                }
            }
        }

        stage('Push to DockerHub') {
            steps {
                script {
                    docker.withRegistry(REGISTRY, 'dockerhub-credentials') {
                        dockerImage.push("${TAG}")
                        dockerImage.push("latest")
                    }
                }
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}