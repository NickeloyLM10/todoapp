# ToDo Application

## Overview
This is a simple ToDo application built using Spring Boot and Thymeleaf. It allows users to add, toggle, and delete tasks in a clean and responsive UI powered by Bootstrap.

## Features
- Add new tasks
- Mark tasks as completed/incomplete
- Delete tasks
- Responsive UI using Bootstrap 5

## Technologies Used
- Java (Spring Boot)
- Thymeleaf (for templating)
- Bootstrap 5 (for styling)
- HTML, CSS

## Setup Instructions
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/todo-app.git
   cd todo-app
   ```
2. Build and run the application:
   ```sh
   mvn spring-boot:run
   ```
3. Open the application in your browser at:
   ```
   http://localhost:8080
   ```

## Project Structure
```
|-- src/
|   |-- main/
|   |   |-- java/com/app/todoapp/
|   |   |   |-- controller/TaskController.java
|   |   |   |-- service/TaskService.java
|   |   |   |-- model/Task.java
|   |   |   |-- repository/TaskRepository.java
|   |   |-- resources/templates/
|   |   |   |-- tasks.html
```
