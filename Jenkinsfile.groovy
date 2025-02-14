pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sleep 15
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}