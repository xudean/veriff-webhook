FROM eclipse-temurin:11.0.18_10-jre-jammy
LABEL authors="xuda"
VOLUME /tmp
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]