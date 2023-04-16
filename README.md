# Transactional Outbox 
Transactional Outbox is a 10-dollar word for a $1 concept. Essentially, it means saving an inbound event to a table in a database with the intention to publish the saved event to an outbound topic. When and how the event is published depends largely on your use case but it's uncommon not to have this happen near real time.

## Purpose
Maintaining state between transactions that span multiple systems (for example, a dispatch to an outbound topic on a messaging platform and an upsert into a database)

## Problem
Transactions T1, T2, T3 across multiple systems cannot all be rolled back if something goes wrong with say T2. T1 and T3 will still have occured, leaving the system in an inconsistent state. 

## Usage
Commonly used as part of long running distributed transactions (aka Sagas) that span multiple microservices.

## Analysis


## References
1. [Outbox](https://softwaremill.com/microservices-101/)
2. [Distributed Transaction](https://hazelcast.com/glossary/distributed-transaction/)
3. [2-Phase Commit](https://martinfowler.com/articles/patterns-of-distributed-systems/two-phase-commit.html)
4. [`save()` vs `saveAndFlush()`](https://stackoverflow.com/a/43884321)
