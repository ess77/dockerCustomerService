FROM java:11
EXPOSE 9012
ADD target/docker-customer-service.jar docker-customer-service.jar
ENTRYPOINT ["java", "-jar", "docker-customer-service.jar"]