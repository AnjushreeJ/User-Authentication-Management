
# E-Commerce User Authentication System

## Project Overview

This project is a Spring Boot based E-Commerce User Authentication System developed using Java, Spring Boot, Spring Security, Spring Data JPA, and MySQL. The application provides secure user registration and login functionalities for an e-commerce platform.

The project follows layered architecture using:

* Controller Layer
* Service Layer
* Repository Layer
* Entity Layer
* DTO Layer
* Security Configuration

The application uses Spring Security for authentication and password encryption.

---

# Technologies Used

| Technology      | Description                    |
| --------------- | ------------------------------ |
| Java            | Programming Language           |
| Spring Boot     | Backend Framework              |
| Spring Security | Authentication & Authorization |
| Spring Data JPA | Database ORM                   |
| Hibernate       | JPA Implementation             |
| MySQL           | Relational Database            |
| Maven           | Dependency Management          |
| REST API        | Communication Layer            |
| Eclipse / STS   | IDE                            |

---

# Project Structure

```text
src/main/java/com/palle
│
├── config
│   └── SecurityConfig.java
│
├── controller
│   ├── AuthController.java
│   └── Usercontroller.java
│
├── dto
│   └── LoginRequest.java
│
├── entity
│   └── User.java
│
├── repository
│   └── UserRepository.java
│
├── service
│   ├── CustomerUserDetailService.java
│   └── UserService.java
│
└── EcomProjectApplication.java
```

---

# Features

## User Registration

* Register new users
* Store user details in MySQL database
* Encrypt passwords using BCrypt

## User Login

* Authenticate users securely
* Validate username and password

## Spring Security

* Secure API endpoints
* Password encoding
* Authentication manager configuration

## Database Integration

* MySQL database connectivity
* Automatic table generation using Hibernate

---

# Dependencies Used

The project uses the following Maven dependencies:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>

<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <scope>runtime</scope>
</dependency>
```

---

# Database Configuration

Create MySQL database:

```sql
CREATE DATABASE ecommerce_db;
```

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=root
spring.datasource.password=MYsql@123

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

---

# Explanation of Important Files

## 1. EcomProjectApplication.java

Main Spring Boot application class.

```java
@SpringBootApplication
public class EcomProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcomProjectApplication.class, args);
    }
}
```

Purpose:

* Starts Spring Boot application
* Initializes embedded Tomcat server
* Loads all Spring configurations

---

## 2. User.java

Entity class representing user table.

### Fields

| Field    | Description        |
| -------- | ------------------ |
| id       | Primary Key        |
| username | User Name          |
| password | Encrypted Password |
| role     | User Role          |

Purpose:

* Maps Java object to MySQL table
* Stores user information

---

## 3. UserRepository.java

Repository interface extending JpaRepository.

```java
public interface UserRepository extends JpaRepository<User, Long>
```

Purpose:

* Performs database operations
* Save users
* Find users
* Delete users
* Update users

---

## 4. UserService.java

Service layer for business logic.

Purpose:

* Register users
* Encode passwords
* Validate user data
* Call repository methods

---

## 5. CustomerUserDetailService.java

Implements Spring Security UserDetailsService.

Purpose:

* Load user from database
* Authenticate login credentials
* Provide security information to Spring Security

---

## 6. SecurityConfig.java

Spring Security configuration class.

Purpose:

* Configure authentication
* Configure authorization
* Password encryption using BCrypt
* Permit or restrict endpoints

---

## 7. AuthController.java

Controller for authentication APIs.

Purpose:

* Handle login requests
* Handle registration requests
* Return API responses

---

## 8. LoginRequest.java

DTO class for login request.

Purpose:

* Transfer login username and password
* Avoid exposing entity directly

---

# Project Workflow

```text
Client Request
      ↓
Controller Layer
      ↓
Service Layer
      ↓
Repository Layer
      ↓
MySQL Database
```

---

# Security Flow

```text
User Login
    ↓
AuthController
    ↓
CustomerUserDetailService
    ↓
Spring Security Authentication
    ↓
Database Validation
    ↓
Access Granted / Denied
```

---

# API Endpoints

| Method | Endpoint  | Description   |
| ------ | --------- | ------------- |
| POST   | /register | Register User |
| POST   | /login    | Login User    |

---

# Steps to Run the Project

## Step 1: Clone Repository

```bash
git clone https://github.com/yourusername/ecom_project.git
```

---

## Step 2: Open in Eclipse / STS

Import as:

```text
Existing Maven Project
```

---

## Step 3: Configure Database

Create MySQL database:

```sql
CREATE DATABASE ecommerce_db;
```

Update `application.properties`.

---

## Step 4: Update Maven

```text
Right Click Project
→ Maven
→ Update Project
```

---

## Step 5: Run Project

Run:

```text
Run As → Spring Boot App
```

---

## Step 6: Test APIs

Use:

* Postman
* Browser
* Thunder Client

---

# Validation Features

The project can support:

* Email validation
* Password validation
* Username validation
* Duplicate user prevention

Example:

```java
@NotBlank
@Email
private String email;
```

---

# Future Enhancements

## E-Commerce Features

* Product Management
* Add to Cart
* Order Management
* Payment Gateway
* Wishlist
* Product Search
* Admin Dashboard
* JWT Authentication
* Role Based Access

## Security Features

* JWT Token Security
* OAuth2 Login
* Email Verification
* Forgot Password

---

# Advantages of Project

* Secure authentication
* Layered architecture
* Easy database integration
* Scalable structure
* Industry standard Spring Boot project
* Suitable for internships and placements

---

# Common Errors and Solutions

## Error: Access denied for user

Solution:

```properties
spring.datasource.password=MYsql@123
```

---

## Error: Unknown database

Solution:

```sql
CREATE DATABASE ecommerce_db;
```

---

## Error: Port 8080 already in use

Solution:

```properties
server.port=8081
```

---

## Error: Maven dependency issue

Solution:

```text
Right Click Project
→ Maven
→ Update Project
```

---

# Output

The application provides:

* User registration functionality
* User login functionality
* Secure password storage
* MySQL database storage
* REST API communication

---

# Conclusion

This E-Commerce Authentication System demonstrates implementation of secure user authentication using Spring Boot and Spring Security. The project follows industry-standard layered architecture and integrates MySQL database for persistent data storage.

The application can be extended into a complete E-Commerce platform by adding product management, cart functionality, payment integration, and advanced security features.

---

# Author

Anjushree J

BE Computer Science Engineering

Spring Boot Developer
