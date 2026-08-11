package com.yanemr.services;

import com.yanemr.dao.IntegrationEventDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicService {

    @Autowired
    private final IntegrationEventDAO integrationEventDAO;

    public BasicService() {
        this(new IntegrationEventDAO());
    }

    public BasicService(IntegrationEventDAO integrationEventDAO) {
        this.integrationEventDAO = integrationEventDAO;
    }

}
