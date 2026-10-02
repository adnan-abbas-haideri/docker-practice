FROM openjdk:17-ea-5-jdk-alpine
WORKDIR /java
COPY . .
RUN javac Main.java
EXPOSE 8000
CMD ["java","Main"]

