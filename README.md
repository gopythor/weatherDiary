# Weather Diary
## Project subject 
- Weather Diary  Using SpringBoot
## Project structure
![image](https://user-images.githubusercontent.com/94863168/226204488-5642d616-49f6-4afe-852c-11e5c0e15c4f.png)
![image](https://user-images.githubusercontent.com/94863168/226204514-ca14e6df-fc2b-4257-8603-c0d6fc02e9f6.png)
## ERD
![image](https://user-images.githubusercontent.com/94863168/226204648-e509c427-b3fe-4083-bb3a-3884cfa7cedd.png)
## Tech Stack
Language : Java  
DBMS : MySQL  
Java Version : Java 8  
IDE : Intellij IDEA 2023.3.2 (Ultimate Edition)  
Test Program : Postman  
etc : Logback, Swagger(API document)  
## API Document(Swagger)
![image](https://user-images.githubusercontent.com/94863168/226204832-f12e721b-c5fc-4788-aed6-c07712b10686.png)
## Project function
Save weather data  
- Save diary to database with diary text and weather

Weather data query  
- Get all diary data for selected date
- Get all weather data for the selected period  

Save Weather Scheduling
- Weather data update at 1:00 AM every day
- Save that data to DB
- Minimize unnecessary work through caching
- Obtain historical weather data from DB if necessary

ETC
- Implementation of API data reference site for each function using Swagger
