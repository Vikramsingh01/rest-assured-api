FROM openjdk:17

WORKDIR /app

COPY target/rest-assured-api.jar .

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "rest-assured-api.jar"]
