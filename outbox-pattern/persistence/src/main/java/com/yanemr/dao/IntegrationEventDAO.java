package com.yanemr.dao;

import com.yanemr.repositories.JpaIntegrationEventRepository;
import com.yanemr.tables.IntegrationEventTable;
import org.springframework.stereotype.Repository;

@Repository
public class IntegrationEventDAO {

    @Autowired
    private JpaIntegrationEventRepository integrationEventRepository;

    public IntegrationEventTable create(IntegrationEventTable event) {
        return integrationEventRepository.save(event);
    }
}
