FROM openjdk:14

COPY logging-demo-0.0.1-SNAPSHOT.jar /tmp

RUN ln -sf /dev/stdout /tmp/java-app.log \
    && ln -sf /dev/stderr /tmp/java-app-errors.log

CMD  java -jar /tmp/logging-demo-0.0.1-SNAPSHOT.jar
