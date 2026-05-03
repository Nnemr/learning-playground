package com.example.lpservice.services;

import java.util.UUID;

public interface LongPollingService {

    UUID submitRequest();

    String getStatus(UUID uuid);
}
