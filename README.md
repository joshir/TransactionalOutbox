# Transactional Outbox 
Transactional Outbox is a 10-dollar word for a $1 concept. Essentially, it means saving an inbound event to a table in a database with the intention to publish the saved event to an outbound topic. When and how the event is published depends largely on your use case but it's uncommon not to have this happen near real time.

## Purpose
Maintaining state between transactions that span multiple systems (for example, a dispatch to an outbound topic on a messaging platform and an upsert into a database)

## Problem
Transactions **T1**, **T2**, **T3** across multiple systems cannot all be rolled back if something goes wrong with say **T2**. **T1** and **T3** will still have occured, leaving the system in an inconsistent state. If, however, transactions **T1** and **T2** were localised by saving **T2**, the event to be dispatched, to the database, we are effectively making **T2** a part of the local ACID transaction **T1**. To make transaction **T3**, say a call to an upstream service, idempotent, we can put in place certain guarantees like a dedup table for incoming events. More stricter guarantees can also be achieved through tightening transaction isolation and propagation levels [5] though performance will be impacted.
## Usage
Commonly used as part of long running distributed transactions (aka Sagas) that span multiple microservices.

## Analysis


## References
1. [Outbox](https://softwaremill.com/microservices-101/)
2. [Distributed Transaction](https://hazelcast.com/glossary/distributed-transaction/)
3. [2-Phase Commit](https://martinfowler.com/articles/patterns-of-distributed-systems/two-phase-commit.html)
4. [`save()` vs `saveAndFlush()`](https://stackoverflow.com/a/43884321)
5. [Isolation and Propagation levels](https://stackoverflow.com/questions/8490852/spring-transactional-isolation-propagation)
