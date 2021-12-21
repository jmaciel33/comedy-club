FROM eclipse-temurin:16-alpine

COPY target/*.jar app.jar

ENV JAVA_TOOL_OPTIONS='-XX:+UseContainerSupport -Djava.security.egd=file:/dev/./urandom'

CMD ["/bin/bash", "-c", "java -jar app.jar"]