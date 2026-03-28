package com.example.demo.controller;

import com.example.demo.model.TestEntity;
import com.example.demo.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestService service;

    @GetMapping("/test")
    public List<TestEntity> test() {
        return service.findAll();
    }

}
