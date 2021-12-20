# Comedy Club

## Stack

- Java
- Spring Boot
- CockroachDB


## Architecture
The main feature of “Hexagonal Architecture”, as opposed to the common layered architecture style, 
is that the dependencies between our components point “inward”, towards our domain objects:

![Hexagonal Architecture](https://github.com/jmaciel33/comedy-club/blob/main/images/hexagonal-architecture.png)

The hexagon is just a fancy way to describe the core of the application that is made up of domain objects, 
use cases that operate on them, and input and output ports that provide an interface to the outside world.

## How to?

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