package com.daignostictest.patients.order_system.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class TestOrder_entity {

	@Id
	private String testorder;
	private String doctorname;

}

