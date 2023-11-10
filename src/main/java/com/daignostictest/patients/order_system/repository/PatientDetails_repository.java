package com.daignostictest.patients.order_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daignostictest.patients.order_system.entity.PatientDetails_entity;

    public interface PatientDetails_repository extends JpaRepository<PatientDetails_entity,Long>
{ 
    
}
