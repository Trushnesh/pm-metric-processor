FROM openjdk:8-alpine

RUN apk --no-cache add curl

ARG JAR_FILE=./target/homeautomationConsumer-1.0-SNAPSHOT.jar

COPY ${JAR_FILE} homeautomationConsumer-1.0-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/homeautomationConsumer-1.0-SNAPSHOT.jar"]