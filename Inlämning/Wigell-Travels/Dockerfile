# Dockerfile
FROM openjdk:17-jdk-slim

# Ange arbetskatalogen
WORKDIR /app

# Kopiera byggd .jar fil till containern
COPY target/Wigell-Travels-0.0.1-SNAPSHOT.jar /app/Wigell-Travels-0.0.1-SNAPSHOT.jar

# Exponera den port som applikationen kör på
EXPOSE 7070

# Starta applikationen
ENTRYPOINT ["java", "-jar", "/app/Wigell-Travels-0.0.1-SNAPSHOT.jar"]
