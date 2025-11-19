pipeline {
    agent any

    tools {
        maven 'Maven_3'
        jdk 'JDK11'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/mohamedachrefkachai/DEVOPS_Med_achref_kachai.git',
                    credentialsId: 'gh-token-achref'
            }
        }

        stage('Build - Skip tests') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Archive Artifact') {
            steps {
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Build réussi ✔️'
        }
        failure {
            echo 'Échec ❌'
        }
    }
}
