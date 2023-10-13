
# Kafka Project README

This project consists of three services:

1. **Order Service,**
2. **Stocker Service,**
3. **Email Service,**

All utilizing Apache Kafka.

## Kafka Broker Configuration
Kafka broker is running on `localhost:9092`.

## Order Service
- **Port:** 8088
- **Description:** This service is responsible for placing orders and producing order messages, which are written to the Kafka message broker.

## Stock Service
- **Port:** 8081
- **Description:** This service consumes Kafka messages by subscribing to the 'stock' topic.

## Email Service
- **Port:** 8082
- **Description:** This service consumes Kafka messages by subscribing to the 'email' topic.

Ensure that Kafka is properly configured and running on `localhost:9092` before running these services.

### Service Setup
1. Clone the repository.
2. Set up the Kafka broker on `localhost:9092`.
3. Run the Order Service on `localhost:8088`.
4. Run the Stock Service on `localhost:8081`.
5. Run the Email Service on `localhost:8082`.

### Useful Links
- [Kafka Documentation](https://kafka.apache.org/documentation/)

![Kafka](https://github.com/adam-p/markdown-here/raw/master/src/common/images/icon48.png)
