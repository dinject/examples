FROM openjdk:13-alpine
#FROM openjdk:11-slim

EXPOSE 7000
#VOLUME /var/log/java

WORKDIR /app
COPY target/lib /app/lib
COPY target/example-javalin-java-1.1-SNAPSHOT.jar /app/app.jar


# For local docker build
#COPY application.yml /app/application.yml

ENV JAVA_OPTS=""
ENTRYPOINT java ${JAVA_OPTS} -jar app.jar
