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
└── main/
└── java/
└── com/
└── nt/
├── SpringbootdatajpaREPOSITORY.java # Main Spring Boot application starter class
├── Entity/ # Contains JPA entities (database table mappings)
│ └── CoronaVaccine.java # Entity class representing the Corona Vaccine table
├── repo/ # Repository layer for database operations
│ └── ICoronaVaccineRepo.java # JPA Repository interface for CRUD operations
├── Runners/ # CommandLineRunner classes for executing test logic at startup
│ └── CrudRepoTestRunner.java # Runner class for testing CRUD repository methods
├── Service/ # Service layer for business logic
│ ├── CoronaVaccineMangServiceImpl.java # Implementation of the service interface
│ └── ICoronaVaccineManagementService.java # Service interface for Corona Vaccine management
└── resources/
└── application.properties # Application configuration file
test/
└── (Unit tests if any) # Test cases for the project


## ⚡ Configuration
Set up your database connection in `application.properties`:
spring.application.name=Springboot-datajpa-pro1
spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
spring.datasource.username=system
spring.datasource.password=your_passowrd
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
