
#
# Build stage
#
FROM maven:3.9.6-eclipse-temurin-21 AS build
COPY src /home/app/src
COPY pom.xml /home/app

RUN apt-get update && apt-get install -y unzip

RUN curl -LO https://github.com/protocolbuffers/protobuf/releases/download/v25.1/protoc-25.1-linux-x86_64.zip && \
    unzip protoc-25.1-linux-x86_64.zip -d /root/go && \
    export PATH="/root/go/bin"

RUN --mount=type=cache,target=/root/.m2 mvn -X -f /home/app/pom.xml clean package

#
# Run stage
#
FROM openjdk:23-ea-14-jdk-oraclelinux9
ARG TARGET_DIR=/home/app/target
COPY --from=build ${TARGET_DIR}/api-core-*.jar /app/runner.jar
EXPOSE 3000
CMD ["java", "-jar", "/app/runner.jar"]