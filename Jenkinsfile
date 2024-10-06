pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/Mikkomannine/SportsTimeTracker.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Code Coverage') {
            steps {
                sh 'mvn jacoco:report'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    sh 'docker build -t mikktma/sportstimetracker:latest .'
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    sh 'docker login -u mikktma -p Eg550dockereg550'
                    sh 'docker push mikktma/sportstimetracker:new'
                }
            }
        }
    }
}
