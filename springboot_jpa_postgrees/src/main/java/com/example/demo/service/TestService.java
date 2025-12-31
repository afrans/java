package com.example.demo.service;

import com.example.demo.entity.TestEntity;
import com.example.demo.repository.TestRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {

    private final TestRepository repository;

    public TestService(TestRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public TestEntity save(TestEntity entity) {
        repository.save(entity);
        repository.flush();
        return (entity);
    }

    public List<TestEntity> findAll() {
        return repository.findAll();
    }
}
