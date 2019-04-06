FROM openjdk:8-jre-alpine3.8
RUN addgroup -S stockmailer && adduser -S -G stockmailer stockmailer
USER stockmailer
WORKDIR /home/stockmailer
COPY ./target/stockmailer-1.0.0-SNAPSHOT.jar ./
ENTRYPOINT ["java","-jar", "/home/stockmailer/stockmailer-1.0.0-SNAPSHOT.jar"]
EXPOSE 8443
