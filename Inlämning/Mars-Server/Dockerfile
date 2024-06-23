# Dockerfile
FROM openjdk:17-jdk-slim

WORKDIR /app

# Kopiera byggd .jar fil till containern
COPY target/Mars-Server-0.0.1-SNAPSHOT.jar /app/Mars-Server-0.0.1-SNAPSHOT.jar

# Exponera den port som applikationen kör på
EXPOSE 8761

# Starta applikationen
ENTRYPOINT ["java", "-jar", "/app/Mars-Server-0.0.1-SNAPSHOT.jar"]
