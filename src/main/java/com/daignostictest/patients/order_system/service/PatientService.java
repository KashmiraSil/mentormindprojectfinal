
package com.daignostictest.patients.order_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daignostictest.patients.order_system.entity.patient_entity;
import com.daignostictest.patients.order_system.repository.patients_repository;
@Service
public class PatientService 
{
    @Autowired
    private patients_repository patientRepository;

    public List<patient_entity> getAllPatients() 
    {
        return patientRepository.findAll();
    }

    public Optional<patient_entity> getPatientById(Long id) 
    {
        return patientRepository.findById(id);
    }

    public patient_entity savePatient(patient_entity patient) 
    {
        return patientRepository.save(patient);
    }
}

