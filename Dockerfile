FROM openjdk:17
EXPOSE 8084
ADD target/student-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]