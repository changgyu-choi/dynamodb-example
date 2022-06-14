FROM gradle:7.4-jdk17

COPY . /usr/src/app

WORKDIR /usr/src/app

RUN gradle -q -x test build

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "build/libs/dynamodb-example-1.0-SNAPSHOT.jar"]