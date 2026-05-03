package com.example.lpservice.persistence;

import com.example.lpservice.entities.PollingResultDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.PrePersist;
import jakarta.persistence.GenerationType;


import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "polling_result")
public class PollingResultTable {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;

    @Column
    private UUID requestId;

    @Column
    private long seconds;

    @Column
    private String host;

    @Column
    private Instant createdAt;

    public PollingResultTable(Long seconds, String host) {
        this(null, null, seconds, host, null);
    }

    public PollingResultTable(Long id, long seconds, String host, Instant createdAt) {
        this(id, null, seconds, host, createdAt);
    }

    public PollingResultTable(
            Long id,
            UUID requestId,
            long seconds,
            String host,
            Instant createdAt
    ) {
        this.id = id;
        this.requestId = requestId;
        this.seconds = seconds;
        this.host = host;
        this.createdAt = createdAt;
    }
    public Long getId() {
        return id;
    }

    public UUID getRequestId() {
        return requestId;
    }

    public long getSeconds() {
        return seconds;
    }

    public String getHost() {
        return host;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }


    @PrePersist
    private void setCreatedAt() {
        this.createdAt = Instant.now();
    }

    public static PollingResultTable toTable(PollingResultDto pollingResultDto) {
        return new PollingResultTable(
                pollingResultDto.id(),
                pollingResultDto.requestId(),
                pollingResultDto.seconds(),
                pollingResultDto.host(),
                pollingResultDto.createdAt()
        );
    }
}
