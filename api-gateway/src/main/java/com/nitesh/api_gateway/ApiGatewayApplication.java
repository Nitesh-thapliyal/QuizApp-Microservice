package com.nitesh.api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}

/*
* Now this is the entry point
* API gateway does not know about the quiz and question service url
* It only knows about the Eureka client i.e QUESTION-SERVICE and QUIZ-SERVICE
*
* so now the new endpoint is: http://localhost:8765/QUIZ-SERVICE/quiz/get/2
*
* here 8765 is port number of api gateway and QUIZ-SERVICE is eureka client
*
* After making changes in application.properties we can search for eureka client in lowercase
* http://localhost:8765/quiz-service/quiz/get/2
* */