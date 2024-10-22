FROM openjdk:21-jdk-slim
LABEL authors="Kiril"
WORKDIR /app
COPY /target/QualityPoint-1.0-SNAPSHOT.jar /app/qualitypoint.jar
ENTRYPOINT ["java", "-jar", "qualitypoint.jar"]