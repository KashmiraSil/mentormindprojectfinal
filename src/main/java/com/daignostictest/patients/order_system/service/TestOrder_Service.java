package com.daignostictest.patients.order_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daignostictest.patients.order_system.entity.TestOrder_entity;
import com.daignostictest.patients.order_system.repository.TestOrder_repository;
@Service
public class TestOrder_Service 
{
    @Autowired
    private TestOrder_repository TestOrderRepository;

    public List<TestOrder_entity> getAllTest() 
    {
        return TestOrderRepository.findAll();
    }

    public Optional<TestOrder_entity> getTestById(String id) 
    {
        return TestOrderRepository.findById(id);
    }

    public TestOrder_entity saveTest(TestOrder_entity Test) 
    {
        return TestOrderRepository.save(Test);
    }
}


