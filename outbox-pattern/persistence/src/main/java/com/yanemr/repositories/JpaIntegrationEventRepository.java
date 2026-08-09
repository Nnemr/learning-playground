package com.yanemr.repositories;

import com.yanemr.tables.IntegrationEventTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaIntegrationEventRepository extends JpaRepository<IntegrationEventTable, Long> {

}
