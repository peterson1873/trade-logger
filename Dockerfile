FROM openjdk:8-jre-alpine3.8
RUN addgroup -S stocklogger && adduser -S -G stocklogger stocklogger
USER stocklogger
WORKDIR /home/stocklogger
COPY ./target/stocklogger-1.0.0-SNAPSHOT.jar ./
ENTRYPOINT ["java","-jar", "/home/stocklogger/stocklogger-1.0.0-SNAPSHOT.jar"]
EXPOSE 8443
