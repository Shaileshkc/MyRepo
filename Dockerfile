FROM openjdk:8
ADD target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
USER root
COPY src/main/resources/ibm-ssl-truststore.jks /tmp
EXPOSE 8085
ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]