# Transactional Outbox 

This is a demo consumer microservice thats saves messages received on an input topic to a dedup table, dispatches the message to an output topic, and fires a request to an upstream service in an all-or-nothing type transactional scenario using [Outbox](https://softwaremill.com/microservices-101/).
