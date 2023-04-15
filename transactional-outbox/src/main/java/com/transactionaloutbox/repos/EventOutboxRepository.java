package com.transactionaloutbox.repos;

import com.transactionaloutbox.domain.EventOutbox;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventOutboxRepository extends JpaRepository<EventOutbox, UUID> {
}
