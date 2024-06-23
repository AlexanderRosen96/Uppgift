# Dockerfile
FROM openjdk:17-jdk-slim

# Ange arbetskatalogen
WORKDIR /app

# Kopiera byggd .jar fil till containern
COPY target/Mars-gateway-0.0.1-SNAPSHOT.jar /app/Mars-gateway-0.0.1-SNAPSHOT.jar

# Exponera den port som applikationen kör på
EXPOSE 8585

# Starta applikationen
ENTRYPOINT ["java", "-jar", "/app/Mars-gateway-0.0.1-SNAPSHOT.jar"]
