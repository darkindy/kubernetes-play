FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY indykube-app/indykube-app-web/target/*.jar indykube-app.jar
ENTRYPOINT ["java","-jar","/indykube-app.jar"]