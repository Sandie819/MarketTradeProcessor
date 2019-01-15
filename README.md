# Market Trade Processor

Developer Challenge for Currency Fair. This is a spring boot application that exposes a rest endpoint to post market trades via a json request. The app consumes trade messages, processes them to an in-memory database and provides a simple frontend facility to view all consumed messages. 

## Deployment

* Clone or Download the project https://github.com/Sandie819/MarketTradeProcessor
* Build the JAR file using Maven; 
  ```
    mvn clean package
  ```
* When the web app has been created, start the web app using Maven
  ```
    mvn spring-boot:run
  ```
  
## Usage / End Points

POST JSON messages to http://localhost:8080/api/v1/trademessage

 ```
{
	"userId" : "testUser3",
	"currencyFrom" : "EUR",
	"currencyTo" : "USD",
	"amountBuy" : 210.00,
	"amountSell" : 800.00,
	"rate" : 0.96,
	"timePlaced": "21-DEC-18 11:20:03",
	"originatingCountry" : "FR"
}
```

To View the consumed messages: http://localhost:8080/results

## Built With

* [Spring Boot](https://spring.io/projects/spring-boot) - The main framework 
* [Maven](https://maven.apache.org/) - Dependency Management


## Authors

* **Sandra Mulligan** 


