package com.example.lpservice.persistence;

import com.example.lpservice.entities.PollingResultDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class PollingResultDaoImpl implements PollingResultDao {

    private JpaPollingResultRepository repo;

    @Override
    public PollingResultDto create(PollingResultDto pollingResultTable) {
        PollingResultTable tableRecord = PollingResultTable.toTable(pollingResultTable);
        PollingResultTable savedRecord = repo.save(tableRecord);
        return PollingResultDto.toEntity(savedRecord);
    }

    @Override
    public PollingResultDto findByRequestId(UUID id) {
        return repo.findByRequestId(id)
                .map(PollingResultDto::toEntity)
                .orElse(null);
    }

    @Autowired
    public void setRepo(JpaPollingResultRepository repo) {
        this.repo = repo;
    }
}
