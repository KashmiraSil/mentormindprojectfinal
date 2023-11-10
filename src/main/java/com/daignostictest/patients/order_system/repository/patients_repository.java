package com.daignostictest.patients.order_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daignostictest.patients.order_system.entity.patient_entity;

@Repository
public interface patients_repository extends JpaRepository<patient_entity,Long>
{ 
    
}

