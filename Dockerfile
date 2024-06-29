FROM openjdk:21
 
LABEL maintainer="kyawlin.klt4991@gmail.com"

COPY target/*.jar app.jar

EXPOSE 8081
 
ENTRYPOINT ["java","-jar","/app.jar"]