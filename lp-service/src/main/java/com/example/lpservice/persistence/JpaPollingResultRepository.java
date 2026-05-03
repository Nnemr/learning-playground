package com.example.lpservice.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface JpaPollingResultRepository extends JpaRepository<PollingResultTable, Long> {

    Optional<PollingResultTable> findByRequestId(UUID requestId);
}
