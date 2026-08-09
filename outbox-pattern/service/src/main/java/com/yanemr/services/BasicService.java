package com.yanemr.services;

import com.yanemr.dao.IntegrationEventDAO;
import org.springframework.stereotype.Service;

@Service
public class BasicService {

    private IntegrationEventDAO integrationEventDAO;

    public BasicService() {
        this(new IntegrationEventDAO());
    }

    public BasicService(IntegrationEventDAO integrationEventDAO) {
        this.integrationEventDAO = integrationEventDAO;
    }

    public void sendEvent(int reading) {
        integrationEventDAO
    }

}
