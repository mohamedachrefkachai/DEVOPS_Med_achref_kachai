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
                // Vérifie la version de Java pour s'assurer que Java 17 est utilisé
                sh 'java -version'

                // Compile avec Maven sans tests
                sh 'mvn clean package -DskipTests'
            }
        }
        
        stage('Archive Artifact') {
            steps {
                // Archiver les artefacts si nécessaire
            }
        }
    }

    post {
        failure {
            echo 'Échec ❌'
        }
    }
}
