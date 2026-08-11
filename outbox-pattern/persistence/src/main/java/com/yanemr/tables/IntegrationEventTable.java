package com.yanemr.tables;

import jakarta.persistence.PrePersist;

import java.time.Instant;
import java.util.UUID;

public class IntegrationEventTable {

    private UUID id;
    private String jsonData;
    private String eventType;

    private long routingId;
    private String version;

    private Instant createdAt;

    private Instant processedAt;


    @PrePersist
    private void setCreatedAt() {
        createdAt = Instant.now();
    }
}
