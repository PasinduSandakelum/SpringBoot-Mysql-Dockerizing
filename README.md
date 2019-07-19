# SpringBoot microservice and mysql db docker container connection

1. First you have to pull mysql docker image into your docker. Use docker pull mysql and the version latest.

2. Use MySQL Image and Command to run the mysql container 
docker run --name mysql-standalone -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=test -e MYSQL_USER=sa -e MYSQL_PASSWORD=password -d mysql:tag

3. In the Spring Boot Application, use the same container IP of the mysql instance in the application.yml spring.datasource.url = jdbc:mysql://<Container-IP>:3306/test

4. Create a Dockerfile for creating a docker image from the Spring Boot Application 
FROM openjdk:8 
ADD target/<jar-file>.jar <destination-filename>.jar 
EXPOSE 8086 ENTRYPOINT ["java", "-jar", "<filename>.jar"]

5. Using the Dockerfile create the Docker image. From the directory of Dockerfile 
docker build . -t user-mysql

6. Run the Docker image (users-mysql) created in 
docker run user-mysql

NOTE : If you want you can directly get the jar file in this repository and run with your container

* To get the container IP - docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' 
container-name or id

# Useful Docker commands

- docker images
- docker container ls
- docker logs <container_name>
- docker container rm <container_name
- docker image rm <image_name
