FROM gradle:6.9-jdk11-alpine

COPY . /usr/src/app

WORKDIR /usr/src/app

RUN gradle build

EXPOSE 8080

ENTRYPOINT ["gradle", "bootRun"]