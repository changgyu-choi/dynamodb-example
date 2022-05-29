# build
## m1 (arm64)
`$ docker build -t dynamodb-example:0.1 .`

## linux/amd64
`$ docker buildx build --platform linux/amd64 -t dynamodb-example:0.1 .`

# run
`$ docker run -d -p 8080:8080 -e SPRING_PROFILES_ACTIVE=local-docker dynamodb-example:0.1`

