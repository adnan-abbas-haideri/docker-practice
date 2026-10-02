# ☕ Java Docker App

A simple Java web application containerized with Docker.

This project is created for **Docker practice** and demonstrates how to build a Java application into a Docker image and run it as a container.

## 🚀 Features

* Java web application
* Simple and clean UI
* Dockerized Java application
* HTTP web server
* Can be accessed from the internet when deployed on a cloud server such as AWS EC2

## 📁 Project Structure

```text
simple-java-app/
│
├── Main.java
├── Dockerfile
└── README.md
```

## 🛠️ Technologies

* Java
* Docker
* HTML
* CSS

## 💻 Run Locally Without Docker

### 1. Compile the application

```bash
javac Main.java
```

### 2. Run the application

```bash
java Main
```

The application runs on:

```text
http://localhost:8080
```

Open the URL in your browser.

## 🐳 Run With Docker

### 1. Build the Docker image

```bash
docker build -t java-docker-app .
```

### 2. Run the container

```bash
docker run -d -p 8080:8080 --name java-app java-docker-app
```

### 3. Open the application

```text
http://localhost:8080
```

## ☁️ Deploy on AWS EC2

To make the application accessible from the internet:

### 1. Launch an EC2 instance

Connect to your EC2 instance using SSH.

### 2. Install Docker

Make sure Docker is installed and running on the EC2 instance.

### 3. Clone the repository

```bash
git clone https://github.com/YOUR-USERNAME/java-docker-app.git
cd java-docker-app
```

### 4. Build the Docker image

```bash
docker build -t java-docker-app .
```

### 5. Run the container

```bash
docker run -d -p 8080:8080 --name java-app java-docker-app
```

### 6. Configure the EC2 Security Group

Allow inbound traffic on:

```text
Type: Custom TCP
Port: 8080
Source: 0.0.0.0/0
```

### 7. Access the application

Open:

```text
http://EC2-PUBLIC-IP:8080
```

Replace `EC2-PUBLIC-IP` with your EC2 instance's public IP address.

## 🧹 Useful Docker Commands

Check running containers:

```bash
docker ps
```

View container logs:

```bash
docker logs java-app
```

Stop the container:

```bash
docker stop java-app
```

Start the container again:

```bash
docker start java-app
```

Remove the container:

```bash
docker rm java-app
```

List Docker images:

```bash
docker images
```

## 🎯 Purpose

This project was created as part of **Docker practice**, focusing on:

* Creating a Dockerfile
* Building Docker images
* Running containers
* Port mapping
* Container management
* Deploying a containerized Java application on AWS EC2
* Making a web application accessible over the internet

## 📌 Note

For production deployments, additional configuration such as a production-ready Java server, HTTPS, reverse proxy, and proper security rules should be used.

