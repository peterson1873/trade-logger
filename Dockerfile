FROM maven:3.5.2-jdk-8-alpine AS MAVEN_TOOL_CHAIN

COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn package


FROM openjdk:8-jre-alpine3.8
EXPOSE 80
RUN apk update;

WORKDIR /usr/app

COPY --from=MAVEN_TOOL_CHAIN /tmp/target/tradelogger*.jar /usr/app

ENTRYPOINT ["java","-jar","/usr/app/tradelogger-1.0.0-SNAPSHOT.jar"]
