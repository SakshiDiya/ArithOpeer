FROM openjdk:17-slim
WORKDIR /app
COPY ArithOperation.java .
RUN javac ArithOperation.java
ENTRYPOINT ["java","ArithOperation"]