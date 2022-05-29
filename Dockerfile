FROM gradle:7.4-jdk17-alpine

COPY . /usr/src/app

WORKDIR /usr/src/app

RUN gradle -q -x test build

EXPOSE 8080

ENTRYPOINT ["gradle", "bootRun"]