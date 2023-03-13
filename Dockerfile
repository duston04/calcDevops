FROM openjdk:11
COPY ./target/calcDevops-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "calcDevops-1.0-SNAPSHOT-jar-with-dependencies.jar"]