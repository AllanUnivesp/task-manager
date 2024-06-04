# Task Manager

## Description
A simple task management system built with Spring Boot.

## Features
- Create, read, delete tasks
- RESTful API

## Technologies
- Java
- Spring Boot
- H2 Database

## Setup
1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/task-manager.git
    ```
2. Navigate to the project directory:
    ```sh
    cd task-manager
    ```
3. Build the project:
    ```sh
    mvn clean install
    ```
4. Run the application:
    ```sh
    mvn spring-boot:run
    ```
5. Access the application at `http://localhost:8080`.

## API Endpoints
- `GET /api/tasks` - Retrieve all tasks
- `POST /api/tasks` - Create a new task
- `DELETE /api/tasks/{id}` - Delete a task

## Testing
To run tests:
```sh
mvn test
