package com.joshi.robin.transactionaloutboxdemo.repos;

import com.joshi.robin.transactionaloutboxdemo.domain.Dedup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DedupRepository extends JpaRepository<Dedup, UUID> {
}
