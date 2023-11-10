package com.daignostictest.patients.order_system.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data

public class PatientDetails_entity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private Long id;
	private String patientname;
    private String email;
	private String address;
    private String country;
    private String state;
    private Long zip;

}

