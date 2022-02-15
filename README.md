# java-logging-in-docker

This application has been containerized in DockerHub at https://hub.docker.com/repository/docker/mvpjava/java-docker-logging

This Java application uses a Java util logger logger which creates to 2 separate files.

- One for startard output log messages in "/tmp/java-app.log"

- Another log file for standard error messages in /tmp/java-app-errors.log

The application was written to showcase ...

1. Docker Logging best practice

2. A Docker logging tip/trick/hack that can be performed in the Dockerfile in order to get logs to
be redirected to stdout and stderr without modifying an existing application

You can follow the tutorial on MVP Java's Blog at Post: http://mvpjava.com/docker-logging-symlink-hack

======================================================

Subscribe to MVP Java ...

https://www.youtube.com/c/MVPJava?sub_confirmation=1

Follow me ...

Website  : http://www.mvpjava.com

Facebook : https://www.facebook.com/mvpjava

Twitter  : https://twitter.com/mvpjava

DockerHub: https://hub.docker.com/?namespace=mvpjava

Company: http://www.triomni-it.com
