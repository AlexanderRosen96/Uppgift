FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/Mars-Server-0.0.1-SNAPSHOT.jar /app/Mars-Server-0.0.1-SNAPSHOT.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "/app/Mars-Server-0.0.1-SNAPSHOT.jar"]
