# authJava 
This is a demo application for Spring Boot + Spring Web that is made for static analysis testing purposes in sonarqube. 

## Technologies 
- Spring Boot
- Spring Web
- MySQL 

## Dependencies 
`spring-boot-devtools` - Devtools for automatic server refresh on save 
`spring-boot-starter-data-jpa` - Java Persistence API for creating a data access layer between `authJava` and MySQL 
`mysql-connector-java` - Java implementation of MySQL client libraries 
`spring-boot-starter-web` - Starter for Spring Boot 
  
## Project Structure
```
/src 
|
|-- /main
     | 
     |-- /java/com/example/auth
                 |
                 |-- /AuthApplication.java   -- Entrypoint for application 
                 |-- /login                  -- Location for login controller + endpoints 
                 |-- /register               -- Location for register controller + endpoints 
                 |-- /entity                 -- Creates entities 
```
