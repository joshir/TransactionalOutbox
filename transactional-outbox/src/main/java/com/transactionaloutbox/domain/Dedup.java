package com.transactionaloutbox.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "DEDUP_STORE")
public class Dedup {
  @Id
  private UUID id;
  @Column(nullable = false)
  private ZonedDateTime createdAt;
  @Column(nullable = false)
  private ZonedDateTime processedAt;
  @Column(nullable = false)
  private String payload;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Dedup dedup = (Dedup) o;
    return Objects.equals(id, dedup.id);
  }

  @Override
  public int hashCode() {
    return id.hashCode();
  }
}
