FROM openjdk:17-oracle
LABEL authors="xuda"
VOLUME /tmp
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]