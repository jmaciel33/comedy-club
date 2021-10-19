# Comedy Club

## Stack

- Java
- Spring Boot
- MongoDB


## Architecture


![Hexagonal Architecture](https://github.com/jmaciel33/comedy-club/blob/main/images/hexagonal-architecture.png)

## How to?

### Pré-requisitos

Follow this steps before launch application


#### Environment variables


### Run

This will 🚀 start the microservice

```
$ ./mvnw spring-boot:run
```

### Run on docker 🐳

Build image 🔨
```
docker build . -t comedy-club-api:latest
```

This will start 🚀 the container

```
docker run -d -p 8080:8080 -it --name comedy-club-api \
comedy-club-api:latest
```
## Run in Postman

[![Run in Postman](https://run.pstmn.io/button.svg)]()

## References

[Hexagonal Architecture with Java and Spring](https://reflectoring.io/spring-hexagonal/)
[Buckpal](https://github.com/thombergs/buckpal)