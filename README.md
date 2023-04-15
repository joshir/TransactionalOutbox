# Transactional Outbox 
Transactional Outbox is a 10-dollar term for saving an inbound event to a table in a database with the intention to publish the saved event to an outbound topic.

## Purpose
Maintaining state between transactions that span multiple systems (for example, a dispatch to an outbound topic on a messaging platform and an upsert into a database)

## Usage
Commonly used as part of long running distributed transactions that span multiple microservices.

## References
1. [Outbox](https://softwaremill.com/microservices-101/)
2. [Distributed Transaction](https://hazelcast.com/glossary/distributed-transaction/)
3. [2-Phase Commit](https://martinfowler.com/articles/patterns-of-distributed-systems/two-phase-commit.html)
4. [`save()` vs `saveAndFlush()`](https://stackoverflow.com/a/43884321)
