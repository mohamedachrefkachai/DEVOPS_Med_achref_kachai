pipeline {
    agent any

    // Utiliser JDK-17 pour l'environnement de build
    tools {
        jdk 'JDK-17'  // Assurez-vous que 'JDK-17' est configuré dans Jenkins
    }

    environment {
        // Définir des variables d'environnement si nécessaire
        // Par exemple, définir MAVEN_HOME si nécessaire pour Maven
        MAVEN_HOME = tool name: 'M3', type: 'ToolLocationNodeProperty'
    }

    stages {
        stage('Checkout SCM') {
            steps {
                // Vérifie le code source depuis Git
                checkout scm
            }
        }

        stage('Build - Skip tests') {
            steps {
                // Vérifie la version de Java et Maven
                sh 'java -version'
                sh 'mvn -v'
                // Compile le projet Maven en sautant les tests
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Archive Artifacts') {
            steps {
                // Archive les artefacts (par exemple, fichiers .jar)
                archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
            }
        }

    }

    post {
        // Actions en cas d'échec de la pipeline
        failure {
            echo 'Le build a échoué ❌'
        }

        // Actions à faire après le succès du build
        success {
            echo 'Le build a réussi ✅'
        }
    }
}
