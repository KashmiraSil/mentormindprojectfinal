package com.daignostictest.patients.order_system.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daignostictest.patients.order_system.entity.PatientDetails_entity;
import com.daignostictest.patients.order_system.service.PatientDetails_Service;
@RestController
@RequestMapping("api/dtl")
public class PatientDetailsController {
	    @Autowired
	    private PatientDetails_Service patientService;

	    @GetMapping("/get")
	    public List<PatientDetails_entity> getAllPatientDetails() 
	    {
	        return patientService.getAllPatientdtl();
	    }

	    @GetMapping("/get/{id}")
	    public Optional<PatientDetails_entity> getPatientDetailsById(@PathVariable Long id)
	    {
	        return patientService.getPatientById(id);
	    }

	    @PostMapping("/save")
	    public PatientDetails_entity savePatientDetails(@RequestBody PatientDetails_entity patientDetails)
	    {
	        return patientService.savePatient(patientDetails);
	    }
	}  

