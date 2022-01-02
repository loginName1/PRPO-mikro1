FROM adoptopenjdk:14-jre-hotspot

RUN mkdir /app

WORKDIR /app

ADD ./target/katalogpostaj-1.0-SNAPSHOT.jar /app

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "katalogpostaj-1.0-SNAPSHOT.jar"]