# Microservices Project
## Overview
This project demonstrates a microservices architecture using the following services:
1. Dev_Service: Manages developer-related operations.
2. Project_Service: Manages project-related operations.
3. Service_Registry: Registers all services to enable service discovery.
4. Api_Gateway: Acts as a gateway for the Dev_Service and Project_Service.
## Architecture
1. Dev_Service:
    - Purpose: Manages developer-related operations.
    - Communication: Makes API calls to the Project_Service.
    - Independence: Designed to operate independently, focusing solely on development tasks.
    - Technology Stack: Java, Spring Boot, Maven, Spring Data JPA.
2. Project_Service:
    - Purpose: Manages project-related operations.
    - Communication: Makes API calls to the Dev_Service.
    - Independence: Designed to operate independently, focusing solely on project management tasks.
    - Technology Stack: Java, Spring Boot, Maven, Spring Data JPA.
3. Service_Registry:
    - Purpose: Registers and manages all microservices, enabling service discovery.
    - Communication: All services register themselves with the Service_Registry.
    - Independence: Acts as a central registry for all microservices.
    - Technology Stack: Netflix Eureka.
4. Api_Gateway:
    - Purpose: Serves as the entry point for the Dev_Service and Project_Service.
    - Communication: Routes client requests to the appropriate service.
    - Independence: Acts as a facade, simplifying interactions with the microservices.
    - Technology Stack: Api Gateway.
## Interaction Flow
1. Client Request: A client sends a request to the Api_Gateway.
2. Api_Gateway Routing: The Api_Gateway routes the request to the appropriate service (Dev_Service or Project_Service).
3. Service Processing: The targeted service processes the request. If needed, it may communicate with another service (e.g., Dev_Service calling Project_Service).
4. Service Response: The service sends the response back to the Api_Gateway.
5. Client Response: The Api_Gateway returns the response to the client.
## Configuration
Configuration files for each service are located in their respective directories. You can modify these files to change settings such as ports, database connections, and other environment variables.
## Contact
If you have any questions or suggestions, please feel free to contact me at nandhavardhan0509@gmail.com.
