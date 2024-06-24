FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/ChangeValue-0.0.1-SNAPSHOT.jar /app/ChangeValue-0.0.1-SNAPSHOT.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "/app/ChangeValue-0.0.1-SNAPSHOT.jar"]
