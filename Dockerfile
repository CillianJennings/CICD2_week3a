FROM openjdk:23

WORKDIR /app

COPY target/week2_refresher_test-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "week2_refresher_test-0.0.1-SNAPSHOT.jar", "--spring.profiles.active=docker"]