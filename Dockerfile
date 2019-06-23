FROM maven:3.5.2-jdk-8-alpine AS MAVEN_TOOL_CHAIN

COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn package


FROM openjdk:8-jre-alpine3.8
EXPOSE 8080

RUN addgroup -S stocklogger && adduser -S -G stocklogger stocklogger
USER stocklogger

COPY --from=MAVEN_TOOL_CHAIN /tmp/target/stocklogger*.jar /home/stocklogger

WORKDIR /home/stocklogger

ENTRYPOINT ["java","-jar", "/home/stocklogger/stocklogger-1.0.0-SNAPSHOT.jar"]
