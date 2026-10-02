# 🐍 Flask Docker App

A simple Flask web application containerized with Docker.

This project is created for **Docker practice** and demonstrates how to build a Python Flask application into a Docker image and run it as a container.

## 🚀 Features

* Flask web application
* Clean and responsive UI
* Dockerized Flask application
* Health check endpoint
* Can be accessed through the internet when deployed on a cloud server such as AWS EC2

## 📁 Project Structure

```text
python-app/
│
├── app.py
├── requirements.txt
├── Dockerfile
├── README.md
│
├── templates/
│   └── index.html
│
└── static/
    └── style.css
```

## 🛠️ Technologies

* Python
* Flask
* Docker
* HTML
* CSS

## 💻 Run Locally Without Docker

### 1. Clone the repository

```bash
git clone https://github.com/YOUR-USERNAME/flask-docker-app.git
cd flask-docker-app
```

### 2. Install dependencies

```bash
pip install -r requirements.txt
```

### 3. Run the application

```bash
python app.py
```

Open your browser:

```text
http://localhost:5000
```

## 🐳 Run With Docker

### 1. Build the Docker image

```bash
docker build -t flask-docker-app .
```

### 2. Run the container

```bash
docker run -d -p 5000:5000 --name flask-app flask-docker-app
```

### 3. Open the application

```text
http://localhost:5000
```

## ☁️ Deploy on AWS EC2

To make the application accessible from the internet:

### 1. Launch an EC2 instance

Connect to your EC2 instance using SSH.

### 2. Install Docker

Make sure Docker is installed and running on the EC2 instance.

### 3. Clone the repository

```bash
git clone https://github.com/YOUR-USERNAME/flask-docker-app.git
cd flask-docker-app
```

### 4. Build the image

```bash
docker build -t flask-docker-app .
```

### 5. Run the container

```bash
docker run -d -p 5000:5000 --name flask-app flask-docker-app
```

### 6. Configure the EC2 Security Group

Allow inbound traffic on:

```text
Type: Custom TCP
Port: 5000
Source: 0.0.0.0/0
```

### 7. Access the application

Open:

```text
http://EC2-PUBLIC-IP:5000
```

Replace `EC2-PUBLIC-IP` with your EC2 instance's public IP address.

## ❤️ Health Check

The application also provides a simple health endpoint:

```text
http://localhost:5000/health
```

It returns:

```json
{
    "status": "healthy"
}
```

## 🧹 Useful Docker Commands

Check running containers:

```bash
docker ps
```

View container logs:

```bash
docker logs flask-app
```

Stop the container:

```bash
docker stop flask-app
```

Start the container again:

```bash
docker start flask-app
```

Remove the container:

```bash
docker rm flask-app
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
* Deploying a containerized application on AWS EC2
* Making a web application accessible over the internet

## 📌 Note

For production deployments, additional configuration such as a production WSGI server, HTTPS, reverse proxy, and proper security rules should be used.

