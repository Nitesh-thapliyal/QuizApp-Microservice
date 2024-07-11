## QuizApp-Microservice: A Scalable and Maintainable Quiz Application

This repository implements a quiz application using a robust microservices architecture. This approach promotes modularity, scalability, and independent development, making it ideal for building complex and evolving applications.

### Embracing Microservices

The microservices architecture decomposes the application into smaller, self-contained services. Each service owns a specific business capability, such as managing questions or quizzes, and operates independently. This approach offers several advantages:

* **Enhanced Modularity:** Fosters a well-organized codebase, promoting easier understanding and maintenance.
* **Superior Scalability:** Enables scaling individual services based on their specific load, optimizing resource utilization.
* **Agile Development:** Allows concurrent development and deployment of services by separate teams, accelerating development cycles.
* **Resilient System Design:** Isolates failures within a single service, minimizing the impact on the entire application.

### Architectural Components

The application leverages the following key components:

* **API Gateway:** Acts as the single entry point for user interaction. It routes incoming requests to the appropriate microservices based on their functionality.
* **Eureka Discovery Server:** Functions as a service registry, maintaining a centralized record of all available microservices within the application. Each service registers itself with Eureka, providing its location and other relevant details.
* **Quiz Service:** Manages the creation, retrieval, and overall lifecycle of quizzes within the application.
* **Question Service:** Handles individual questions, including their creation, retrieval, and associated metadata.
* **Feign Client:** A library utilized by the Quiz Service to seamlessly communicate with the Question Service. It simplifies HTTP request exchanges between microservices by abstracting away underlying network complexities.

### Choosing Microservices for Your Project

This architecture provides significant benefits for quiz applications:

* **Scalability:** Enables independent scaling of the API Gateway and individual services to handle surges in user traffic.
* **Agile Development:** Allows concurrent development of Quiz and Question services by separate teams, accelerating development cycles.
* **Improved Maintainability:** Promotes a modular codebase that is easier to understand, maintain, and evolve.

### Getting Started

To run this application, ensure you have the following tools installed:

* Java Development Kit (JDK)
* Maven

**1. Clone the Repository**

```bash
git clone https://github.com/<your-username>/QuizApp-Microservice.git
```

**2. Build the Services**

```bash
cd QuizApp-Microservice
mvn clean install
```

**3. Run the Services**

Each microservice can be started independently using a command like:

```bash
mvn spring-boot:run -Dspring.profiles.active=quiz-service
```

**4. Configure Eureka Server**

(Optional) For the Eureka server to locate other microservices, edit its `application.properties` file to specify their IP addresses.

**5. Access the Application**

(Once configured) Access the API Gateway through the port defined in its `application.properties` file (default: 8080). 

