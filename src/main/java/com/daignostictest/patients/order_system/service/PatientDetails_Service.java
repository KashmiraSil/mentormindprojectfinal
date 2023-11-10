package com.daignostictest.patients.order_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daignostictest.patients.order_system.entity.PatientDetails_entity;
import com.daignostictest.patients.order_system.repository.PatientDetails_repository;
@Service
public class PatientDetails_Service {
    
 @Autowired
    private PatientDetails_repository PatientDetails_repository;

    public List<PatientDetails_entity> getAllPatientdtl() 
    {
        return PatientDetails_repository.findAll();
    }

    public Optional<PatientDetails_entity> getPatientById(Long id) 
    {
        return PatientDetails_repository.findById(id);
    }

    public PatientDetails_entity savePatient(PatientDetails_entity patient) 
    {
        return PatientDetails_repository.save(patient);
    }
}

