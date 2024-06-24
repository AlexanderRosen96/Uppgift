FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/Mars-gateway-0.0.1-SNAPSHOT.jar /app/Mars-gateway-0.0.1-SNAPSHOT.jar

EXPOSE 8585

ENTRYPOINT ["java", "-jar", "/app/Mars-gateway-0.0.1-SNAPSHOT.jar"]
