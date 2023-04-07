# OutboxPatternDemo

This module will demo a consumer (microservice) that uses the outbox pattern. I plan on using a relational database (Postgresql), Spring/Java and Apache Kafka. I want to guarantee transactional integrity/idempotency of not only messages in the outbox table but also any upstream services that this consumer will dial into. I may opt out of Change Data Capture and rely on a cron job type mechanism to relay the messages in the outbox, especially since CDC is dictated by the choice of database.
