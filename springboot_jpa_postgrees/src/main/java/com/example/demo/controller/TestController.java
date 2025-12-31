package com.example.demo.controller;

import com.example.demo.entity.TestEntity;
import com.example.demo.service.TestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/test")
public class TestController {

    private final TestService service;

    public TestController(TestService service) {
        this.service = service;
    }

    @PostMapping
    public TestEntity create(@RequestBody TestEntity entity) {
        return service.save(entity);
    }

    @GetMapping
    public List<TestEntity> list() {
        return service.findAll();
    }
}

