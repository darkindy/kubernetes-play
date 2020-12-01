FROM maven:3.3-jdk-8
RUN mkdir -p /usr/local/src/indykube-app
WORKDIR /usr/local/src/indykube-app
COPY ./indykube-app .
RUN mvn clean install

WORKDIR /
RUN cp /usr/local/src/indykube-app/indykube-app-web/target/*.jar indykube-app.jar
VOLUME /tmp
ENTRYPOINT ["java","-jar","/indykube-app.jar"]