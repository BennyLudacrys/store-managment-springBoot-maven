##creating dockerfile image
FROM openjdk:17

COPY target/*.jar app.jar
##whenever the container is starting up will run this command
ENTRYPOINT {"java","-jar", "/app.jar"}