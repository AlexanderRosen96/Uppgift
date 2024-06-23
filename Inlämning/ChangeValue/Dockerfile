# Dockerfile
FROM openjdk:17-jdk-slim

# Ange arbetskatalogen
WORKDIR /app

# Kopiera byggd .jar fil till containern
COPY target/ChangeValue-0.0.1-SNAPSHOT.jar /app/ChangeValue-0.0.1-SNAPSHOT.jar

# Exponera den port som applikationen kör på
EXPOSE 8761

# Starta applikationen
ENTRYPOINT ["java", "-jar", "/app/ChangeValue-0.0.1-SNAPSHOT.jar"]
