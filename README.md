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

```plaintext
src/
 └── main/
     ├── java/
     │   └── com/
     │       └── nt/
     │           ├── SpringbootdatajpaREPOSITORY.java
     │           ├── Entity/
     │           │   └── CoronaVaccine.java
     │           ├── ropo/
     │           │   └── ICoronaVaccineRepo.java
     │           ├── Runners/
     │           │   └── CrudRepoTestRunner.java
     │           └── Service/
     │               ├── CoronaVaccineMangServiceImpl.java
     │               └── ICoronaVaccineManagementService.java
     └── resources/
         └── application.properties

## ⚡ Configuration
Set up your database connection in `application.properties`:
# --- Database Connection Properties ---
# Specifies the JDBC driver class for Oracle.
spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver

# Configures the connection URL for the Oracle database.
# This URL points to the 'xe' SID on the local machine at port 1521.
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:orcl

# Sets the database username.
spring.datasource.username=system

# Sets the password for the database user.
spring.datasource.password=Chinmay

# --- JPA and Hibernate Properties ---
# Specifies the Hibernate dialect for Oracle, which helps Hibernate generate Oracle-specific SQL.
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.OracleDialect

# When set to true, this logs all SQL queries to the console for debugging.
spring.jpa.show-sql=true

# Configures Hibernate to automatically update the database schema based on your entities.
# The `update` value adds or modifies tables and columns but doesn't drop them.
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
