package com.daignostictest.patients.order_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daignostictest.patients.order_system.entity.TestOrder_entity;
@Repository
    public interface TestOrder_repository extends JpaRepository<TestOrder_entity,String>
 
    {

    }

