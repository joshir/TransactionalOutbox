# Transactional Outbox 

## Purpose
Maintaining state between transactions that span multiple systems (for example, a dispatch to an outbound topic to a messaging platform and an upsert into a database)

## Usage
Commonly used as part of long running distributed transactions that span multiple microservices.

## References
1. [Outbox](https://softwaremill.com/microservices-101/)
2. [Distributed Transaction](https://hazelcast.com/glossary/distributed-transaction/)
3. [2-Phase Commit](https://martinfowler.com/articles/patterns-of-distributed-systems/two-phase-commit.html)
4. [`save()` vs `saveAndFlush()`](https://stackoverflow.com/a/43884321)
