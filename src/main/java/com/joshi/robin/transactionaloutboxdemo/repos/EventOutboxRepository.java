package com.joshi.robin.transactionaloutboxdemo.repos;

import com.joshi.robin.transactionaloutboxdemo.domain.EventOutbox;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventOutboxRepository extends JpaRepository<EventOutbox, UUID> {
}
