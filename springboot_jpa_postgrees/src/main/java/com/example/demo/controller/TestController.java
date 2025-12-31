package com.example.demo.controller;

import com.example.demo.entity.TestEntity;
import com.example.demo.repository.TestRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    private final TestRepository repository;

    public TestController(TestRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public TestEntity create(@RequestBody TestEntity entity) {
        return repository.save(entity);
    }

    @GetMapping
    public List<TestEntity> list() {
        return repository.findAll();
    }
}
