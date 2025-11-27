#FROM ubuntu:latest
#LABEL authors="King"
#
#ENTRYPOINT ["top", "-b"]

FROM openjdk:21

WORKDIR /app

COPY target/productcatalog-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]