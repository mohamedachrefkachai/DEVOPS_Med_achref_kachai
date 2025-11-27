# Étape 1 : Image de base
FROM eclipse-temurin:17-jdk-alpine

# Étape 2 : Créer un dossier dans le container
WORKDIR /app

# Étape 3 : Copier le JAR généré
COPY target/*.jar app.jar

# Étape 4 : Lancer l'application
ENTRYPOINT ["java", "-jar", "app.jar"]
