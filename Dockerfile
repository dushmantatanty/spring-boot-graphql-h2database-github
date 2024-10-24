FROM openjdk:8
WORKDIR usr/src

EXPOSE 8000

ADD ./target/test-service-0.0.1-SNAPSHOT.jar /usr/src/test-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "test-service-0.0.1-SNAPSHOT.jar"]
