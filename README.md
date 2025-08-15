# Spring Boot Data JPA Finder Methods

## 📌 Project Overview
This project demonstrates the usage of **Spring Boot** with **Spring Data JPA** to perform database operations using **Finder Methods** (Query Methods). It uses **Oracle Database** as the backend and is configured via `application.properties`.

## ⚙️ Features
- Perform CRUD operations using Spring Data JPA.
- Implement Finder Methods without writing explicit SQL queries.
- Connect to Oracle Database using Hibernate ORM.
- Auto table creation and update using `spring.jpa.hibernate.ddl-auto=update`.

## 🛠 Technologies Used
- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **Oracle Database XE**
- **Maven**

## 📂 Project Structure
src/
 ├── main/
 │   ├── java/
 │   │   └── com/nt/
 │   │       ├── SpringbootdatajpaREPOSITORY.java
 │   │       ├── Entity/
 │   │       │   └── CoronaVaccine.java
 │   │       ├── ropo/
 │   │       │   └── ICoronaVaccineRepo.java
 │   │       ├── Runners/
 │   │       │   └── CrudRepoTestRunner.java
 │   │       └── Service/
 │   │           ├── CoronaVaccineMangServiceImpl.java
 │   │           └── ICoronaVaccineManagementService.java
 │   └── resources/
 │       └── application.properties
 └── test/
         (Unit tests if any)

## ⚡ Configuration
Set up your database connection in `application.properties`:
spring.application.name=Springboot-datajpa-pro1
spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
spring.datasource.username=system
spring.datasource.password=Chinmay
spring.jpa.properties.hibernate.enable_lazy_load_no_trans=true
spring.jpa.database-platform=org.hibernate.dialect.Oracle10gDialect
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update

## 🚀 How to Run
1. Clone the repository  
   git clone https://github.com/Chinmay7070/springboot-datajpa-finder-methods.git
2. Open in IDE (IntelliJ / Eclipse / VS Code).
3. Configure Oracle Database and update credentials in `application.properties`.
4. Build the project  
   mvn clean install
5. Run the application  
   mvn spring-boot:run
6. The application will start at http://localhost:8080.
