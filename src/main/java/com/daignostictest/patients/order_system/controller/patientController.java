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

import com.daignostictest.patients.order_system.entity.patient_entity;
import com.daignostictest.patients.order_system.service.PatientService;

	@RestController
	@RequestMapping("/api/patients")
	
	public class patientController 
	{
	    @Autowired
	    private PatientService patientService;

	    @GetMapping("/get")
	    public List<patient_entity> getAllPatients() 
	    {
	        return patientService.getAllPatients();
	    }

	    @GetMapping("/get/{id}")
	    public Optional<patient_entity> getPatientById(@PathVariable Long id)
	    {
	        return patientService.getPatientById(id);
	    }

	    @PostMapping("/save")
	    public patient_entity savePatient(@RequestBody patient_entity patient)
	    {
	        return patientService.savePatient(patient);
	    }
	}


