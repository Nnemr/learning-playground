FROM flyway/flyway

WORKDIR /outbox-pattern
CMD ["mvn", "clean", "package"]
COPY target/flyway.jar db-migrations.jar

ENTRYPOINT ["java", "-jar", "db-migrations.jar"]
