package com.daignostictest.patients.order_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daignostictest.patients.order_system.entity.TestOrder_entity;
import com.daignostictest.patients.order_system.repository.TestOrder_repository;


@RestController
public class webController 
{
   @Autowired
    private TestOrder_repository repo;




@GetMapping ("/home")
    public String home()
    {
        return "Home";
    }

    @GetMapping ("/loggin")
    public String loggin()
    {
        return "loggin";
    }


@GetMapping ("/testorder")
public String testorder()
    {
        return "testorder";
    }



@PostMapping("/testorder")  
public String testorder(@ModelAttribute TestOrder_entity tstodr)
{
repo.save(tstodr);   
return "testorder";

}




@GetMapping ("/placeorder")
    public String placeorder()
    {
        return "placeorder";
    }

@GetMapping ("/payment")
    public String payment()
    {
        return "payment";
    }

    @GetMapping ("/orderconfirmation")
    public String orderconfirmation()
    {
        return "orderconfirmation";
    }


}



    
