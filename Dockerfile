# syntax=docker/dockerfile:1

FROM eclipse-temurin:17-jdk-jammy
ARG JAR_FILE=target/*.jar
COPY ./target/OrganizadorDoc-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]