FROM openjdk:11

EXPOSE 8088

COPY ./build/libs/hibernate-mappings.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "hibernate-mappings.jar"]
