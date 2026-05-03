FROM eclipse-temurin:21-jdk

WORKDIR /lp-service
CMD ["./gradlew", "clean", "bootJar"]
COPY build/libs/*.jar lp-service.jar

ENTRYPOINT ["java", "-jar", "lp-service.jar"]
