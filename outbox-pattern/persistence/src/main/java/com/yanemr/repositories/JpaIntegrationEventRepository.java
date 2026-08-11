package com.yanemr.repositories;

import com.yanemr.tables.IntegrationEventTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaIntegrationEventRepository extends JpaRepository<IntegrationEventTable, UUID>
{}
