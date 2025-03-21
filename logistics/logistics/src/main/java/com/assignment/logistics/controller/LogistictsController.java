package com.assignment.logistics.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.logistics.request.LogisticRequest;
import com.assignment.logistics.request.LogisticResponse;
import com.assignment.logistics.service.LogisticService;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
//@RequestMapping("/")
public class LogistictsController {

    @Autowired LogisticService logisticService;

    @ResponseBody()
	@GetMapping(value = "/next-tracking-number")
    public LogisticResponse getTrackingNumber( 
    @RequestParam String origin_country_id,
    @RequestParam String destination_country_id,
    @RequestParam double weight,
    @RequestParam String created_at,
    @RequestParam String customer_id,
    @RequestParam String customer_name,
    @RequestParam String customer_slug
    
    ) {
        try{
            LogisticRequest request = LogisticRequest.builder()
            .originCountryId(origin_country_id)
            .destinationCountryId(destination_country_id)
            .weight(weight)
            .createdAt(created_at)
            .customerId(customer_id)
            .customerName(customer_name)
            .customerSlug(customer_slug)
            .build();
        
            System.out.println("Received Request:" +request); //We can add logger later here

             return logisticService.createRecord(request); //call service 
        }catch(Exception err){
            System.out.println("Error while receiving request - "+err.getMessage());
        }
        return LogisticResponse.builder().build();
    }

    


}
