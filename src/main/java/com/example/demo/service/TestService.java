package com.example.demo.service;

import com.example.demo.model.TestEntity;
import com.example.demo.repo.TestEntityRepo;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestEntityRepo repo;

    @PostConstruct
    public void test(){
        repo.save(new TestEntity(null,"test", true));
    }

    public List<TestEntity> findAll() {
        return repo.findAll();
    }
}
