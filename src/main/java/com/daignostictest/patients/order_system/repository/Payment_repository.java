package com.daignostictest.patients.order_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daignostictest.patients.order_system.entity.Payment_Entity;

@Repository
public interface Payment_repository extends JpaRepository<Payment_Entity,Long>
{ 
    
}
