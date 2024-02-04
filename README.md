# Kafka

This is a sample Java Spring Boot project demonstrating how to integrate Apache Kafka as a message broker with a publisher and consumer.

## Prerequisites

Before running this project, ensure that you have the following installed:

- Java Development Kit (JDK) 21
- Apache Kafka (download and installation instructions can be found [here](https://kafka.apache.org/downloads))
- Maven

## Setup

1. Clone this repository:

   ```bash
   git clone https://github.com/Scoobie02/kafka.git
   ```

2. Navigate to the project directory:

   ```bash
   cd kafka
   ```

3. Start ZooKeeper and Kafka. 

If you have Kafka installed locally, you can start ZooKeeper and Kafka server using the default configuration:

   ```bash
   bin/zookeeper-server-start.sh config/zookeeper.properties
   bin/kafka-server-start.sh config/server.properties
   ```

If you have docker on your machine just run docker-compose.yaml
   ```
   docker run docker-compose.yaml
   ```

## Running the Application

1. Start the Publisher Spring Boot application:

   ```bash
   cd publisher
   mvn spring-boot:run
   ```

2. The producer has multiple endpoints to test kafka use-cases. 

3. Start the Consumer Spring Boot application:

   ```bash
   cd consumer
   mvn spring-boot:run
   ```
4. The consumer will consume messages from the Kafka topics and print them to the console.

## Configuration

The Kafka configurations such as server address can be found in the `application.properties` file under `src/main/resources`.

Topic names, and consumer group IDs are defined on configuration class level.

---

Feel free to contact me with ideas that inspired you under:
- [skubala.wojciech@gmail.com](mailto:skubala.wojciech@gmail.com)