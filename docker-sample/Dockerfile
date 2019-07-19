FROM openjdk:8
ADD target/user-mysql-application.jar user-mysql-application.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "user-mysql-application.jar"]