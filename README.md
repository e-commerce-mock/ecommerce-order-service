# Project Intro
This project is the Order subsystem of the Ecommerce system, used to accept user orders。

Ecommerce Project includes：

|Repo|Purpose|Link|
| --- | --- | --- |
|ecommerce-order-service|Order service|[https://github.com/e-commerce-mock/ecommerce-order-service](https://github.com/e-commerce-mock/ecommerce-order-service)|
|ecommerce-order-query-service|Order query service|[https://github.com/e-commerce-mock/ecommerce-order-query-service](https://github.com/e-commerce-mock/ecommerce-order-query-service)|
|ecommerce-product-service|Product service|[https://github.com/e-commerce-mock/ecommerce-product-service](https://github.com/e-commerce-mock/ecommerce-product-service)|
|ecommerce-inventory-service|Inventory service|[https://github.com/e-commerce-mock/ecommerce-inventory-service](https://github.com/e-commerce-mock/ecommerce-inventory-service)|
|ecommerce-shared-model|Pure Shared model without Spring context|[https://github.com/e-commerce-mock/ecommerce-shared-model](https://github.com/e-commerce-mock/ecommerce-shared-model)|
|ecommerce-spring-common|Shared basic Spring configuration|[https://github.com/e-commerce-mock/ecommerce-spring-common](https://github.com/e-commerce-mock/ecommerce-spring-common)|
|ecommerce-devops|Infrastructure|[https://github.com/e-commerce-mock/ecommerce-devops](https://github.com/e-commerce-mock/ecommerce-devops)|

# Tech stacks
Spring Boot、Gradle、MySQL、Junit 5、Rest Assured、Docker、RabbitMQ/Kafka

# Build Project in local

The following steps must be completed before building locally：
- Pull latest[devops](https://github.com/e-commerce-mock/devops)代码
- Go to folder `ecommerce-sample/devops/local/rabbitmq` of `devops`  
- Run `./start-rabbitmq.sh` to start RabbitMQ. You only need to start RabbitMQ once to serve all services under the entire Ecommerce
- Go to folder `ecommerce-sample/devops/local/zipkin` of `devops`
- Run `./start-zipkin.sh` to start zipkin server. You only need to start Zipkin once to serve all services under the entire Ecommerce


|Function|Command|Notes|
| --- | --- | --- |
|Generate IntelliJ project|`./idea.sh`|Automatically open IntelliJ|
|Run locally|`./run.sh`|Automatically start MySQL, open HTTP 8083 port, listen on 5007 debugging port|
|Build locally|`./local-build.sh`|Start MySQL, run all types of automated tests|
|Stop MySQL|`./gradlew composeDown`|All data will be cleared|
|Empty local MySQL|`./mysql-clean-local.sh`|Will not rebuild the MySQL instance|
|Log in to local MySQL|`./mysql-login-local.sh`||
|Start MySQL|`./gradlew composeUp`||
|Publish sdk|`./publish-sdk.sh`|The version can be specified by modifying the `version` in the `gradle.properties` file|

# Domain Object
|Domain Object|Business|
| --- | --- | --- |
|Order|Indicates the order used to place, including multiple products and their quantities|

# Test strategy
|Test Type|Directory|Description|
| --- | --- | --- |
|Unit test|`src/test/java`|Contains tests for core domain models (including domain objects and Factory classes)|
|Component test|`src/componentTest/java`|Used to test some core component-level objects, such as Repository|
|API Test|`src/apiTest/java`|Simulate client calling API|

# Technical Architecture
Technical architecture diagram

# Deployment architecture
Deployment architecture diagram

# External dependencies
List other systems that the project depends on, for example, the order system depends on the membership system.

# Environmental information
List the access methods of each environment, database connection, etc.

# Coding Practice
List commonly used public coding practices.

# FAQ

# Principle

