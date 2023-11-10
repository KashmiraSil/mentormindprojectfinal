package com.daignostictest.patients.order_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daignostictest.patients.order_system.entity.Payment_Entity;
import com.daignostictest.patients.order_system.repository.Payment_repository;
@Service
public class Payment_Service 
    {
    @Autowired
    private Payment_repository PaymentRepository;

    public List<Payment_Entity> getAllPayment() 
    {
        return PaymentRepository.findAll();
    }

    public Optional<Payment_Entity> getPaymentById(Long cardNumber) 
    {
        return PaymentRepository.findById(cardNumber);
    }

    public Payment_Entity savePayment(Payment_Entity cardNumber) 
    {
        return PaymentRepository.save(cardNumber);
    }
}

