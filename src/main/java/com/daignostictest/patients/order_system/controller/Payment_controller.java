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

import com.daignostictest.patients.order_system.entity.Payment_Entity;
import com.daignostictest.patients.order_system.service.Payment_Service;

@RestController
@RequestMapping("/api/payments")
class PaymentController {
 @Autowired
 private Payment_Service PaymentService;


     @GetMapping("/get")

    public List<Payment_Entity> getAllPayment() {
         return PaymentService.getAllPayment();
	    }
    
        @GetMapping("/get/{cardNumber}")
	    public Optional<Payment_Entity> getPatientById(@PathVariable Long cardNumber)
	    {
	        return PaymentService.getPaymentById(cardNumber);
	    }

    @PostMapping("/save")
    public Payment_Entity createPayment(@RequestBody Payment_Entity payment) {
        // In a real-world scenario, you would validate and process the payment here.
       PaymentService.savePayment(payment);
        return payment;
    }
}