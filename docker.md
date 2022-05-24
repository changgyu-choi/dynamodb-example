# build
`$ docker build -t dynamodb-example:0.1 .`

# run
`$ docker run -d -p 8080:8080 -e SPRING_PROFILES_ACTIVE=local-docker dynamodb-example:0.1`