package com.example.lpservice.persistence;


import com.example.lpservice.entities.PollingResultDto;

import java.util.UUID;

public interface PollingResultDao {

    PollingResultDto create(PollingResultDto pollingResultDto);

    PollingResultDto findByRequestId(UUID id);
}