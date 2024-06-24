FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/Wigell-Travels-0.0.1-SNAPSHOT.jar /app/Wigell-Travels-0.0.1-SNAPSHOT.jar

EXPOSE 7070

ENTRYPOINT ["java", "-jar", "/app/Wigell-Travels-0.0.1-SNAPSHOT.jar"]
