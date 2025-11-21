pipeline {
    agent any

    tools {
        jdk 'JDK-17'  // Utilise le JDK 17 que tu as configuré dans Jenkins
    }

    stages {
        stage('Checkout SCM') {
            steps {
                checkout scm
            }
        }

        stage('Build - Skip tests') {
            steps {
                sh 'java -version'  // Vérifie la version de Java
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Archive Artifact') {
            steps {
                // Archive les artefacts ici si nécessaire
            }
        }
    }

    post {
        failure {
            echo 'Échec ❌'
        }
    }
}
