FROM java:8
VOLUME /tmp
ADD target/backend-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongodb:27017/micros","-Dspring.datasource.url=jdbc:postgresql://postgres:5432/ng2boot", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
