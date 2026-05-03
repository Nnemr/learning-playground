package com.example.lpservice.entities;

import com.example.lpservice.persistence.PollingResultTable;

import java.time.Instant;
import java.util.UUID;

public record PollingResultDto(
        Long id,
        UUID requestId,
        long seconds,
        String host,
        Instant createdAt
){

    public PollingResultDto(UUID requestId, long seconds, String host) {
        this(null, requestId, seconds, host, null);
    }

    public static PollingResultDto toEntity(PollingResultTable pollingResultTable) {
        return new PollingResultDto(
                pollingResultTable.getId(),
                pollingResultTable.getRequestId(),
                pollingResultTable.getSeconds(),
                pollingResultTable.getHost(),
                pollingResultTable.getCreatedAt()
        );
    }
}
