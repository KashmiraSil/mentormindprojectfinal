package com.daignostictest.patients.order_system.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Payment_Entity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long payment_Id;
        private String paymentmode;
        private String nameoncard;
        private Long cardnumber;
        private Long expiry;
        private Long cvv;
}
