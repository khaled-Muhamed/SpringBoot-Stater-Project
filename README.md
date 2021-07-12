## Project Title [ Demo ]

This is a starting project where I learn basics for SpringBoot framework. Adding layers(API layer, Service layer , Data Access layer).
also trying database connection using springBoot fetching ,inserting, updating and deleting records. using annotations for Spring data JPA.
I used Postman to send and apply HTTP requests.


## Getting Started

Just run the demo jar file and got to "localhost:8080/api/v1/students" in your favourite browser 
make sure that you have postgres installed and modify the username and password in application.properties file 
also check the port used in the url.

Now you can send requests and receive esponses.

## Prerequisites

Browser software is needed like chrome , mozilla ,etc.
Postgresql or Mysql or others.
Intelliji  or Eclipse to import project and edit if you want.

## Important Files

 src/main/java/com/example/demo/Student/Student   : This file contains the Entity Student which will be the table in DB.
 src/main/java/com/example/demo/Student/StudentConfig   : This is the configuration file think of it as the container in spring core.
 src/main/java/com/example/demo/Student/StudentController : This is the API file.
 src/main/java/com/example/demo/Student/SpringRepository : This is the Data Access Layer.
 src/main/java/com/example/demo/Student/StudentService : This is the Service Layer.
 
## How to run

Just run the demo jar file and got to "localhost:8080/api/v1/students" in your favourite browser 
make sure that you have postgres installed and modify the username and password in application.properties file 
also check the port used in the url.

  *run in terminal the following command:

    1- java -jar demo-0.0.1-SNAPSHOT.jar
    2- proceed to "localhost:8080/api/v1/students"
    3- start sending requests you need :).


## References 
  https://www.youtube.com/watch?v=9SGDpanrc8U&t=16s&ab_channel=Amigoscode



## Authors
 1- Amigoscode channel on youtube.
 2- khaled Mohamed Abdelghany.