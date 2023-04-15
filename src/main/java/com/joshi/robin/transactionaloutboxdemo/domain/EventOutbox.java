package com.joshi.robin.transactionaloutboxdemo.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.ZonedDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "EVENT_OUTBOX")
public class EventOutbox {
  private static final int VARCHAR_MAX_LENGTH = 4096;

  @Id
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "uuid2")
  private UUID id;

  @Column(nullable = false)
  private String payload;

  @Column(nullable = false)
  private ZonedDateTime dispatchedAt;

  @Column(nullable = false)
  private String destination;

  @Version
  private int version;
}
