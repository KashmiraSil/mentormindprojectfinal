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

import com.daignostictest.patients.order_system.entity.TestOrder_entity;
import com.daignostictest.patients.order_system.service.TestOrder_Service;
@RestController
@RequestMapping("/tstodr")
public class TestOrderController {
    @Autowired
	    private TestOrder_Service TS;

	    @GetMapping("/get")
	    public List<TestOrder_entity> getAllTestOrder() 
	    {
	        return TS.getAllTest();
	    }

	    @GetMapping("/get/{Id}")
	    public Optional<TestOrder_entity> getAllTestOderById(@PathVariable String Id)
	    {
	        return TS.getTestById(Id);
	    }

	    @PostMapping("/save")
	    public TestOrder_entity saveTestOrder(@RequestBody TestOrder_entity TestOder)
	    {
	        return TS.saveTest(TestOder);
	    }
}

