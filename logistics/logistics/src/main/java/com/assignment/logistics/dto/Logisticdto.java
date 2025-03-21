package com.assignment.logistics.dto;

import org.springframework.data.annotation.Id;

public class Logisticdto {
    @Id
    long id;
    String originCountryId;
    String destinationCountryId;
    double weight;
    String createdAt;
    String customerId;
    String customerName;
    String customerSlug;
    String trackingNumber;
    String trackingNumberCreatedAt;

    
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }


    public void setTrackingNumberCreatedAt(String trackingNumberCreatedAt) {
        this.trackingNumberCreatedAt = trackingNumberCreatedAt;
    }

    

    public Logisticdto(){

    }

    
    public String getOriginCountryId() {
        return originCountryId;
    }
    public void setOriginCountryId(String originCountryId) {
        this.originCountryId = originCountryId;
    }
    public String getDestinationCountryId() {
        return destinationCountryId;
    }
    public void setDestinationCountryId(String destinationCountryId) {
        this.destinationCountryId = destinationCountryId;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerSlug() {
        return customerSlug;
    }
    public void setCustomerSlug(String customerSlug) {
        this.customerSlug = customerSlug;
    }
    public String getTrackingNumber() {
        return trackingNumber;
    }
    
    public long getId() {
        return id;
    }



    public void setId(long id) {
        this.id = id;
    }


    public String getTrackingNumberCreatedAt() {
        return trackingNumberCreatedAt;
    }


    


    

}
