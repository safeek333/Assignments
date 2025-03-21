package com.assignment.logistics.service;


import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.assignment.logistics.dto.Logisticdto;
import com.assignment.logistics.repository.LogisticRepository;
import com.assignment.logistics.request.LogisticRequest;
import com.assignment.logistics.request.LogisticResponse;

public class LogisticServiceImpl implements LogisticService{

    @Autowired LogisticRepository logisticRepository;
    @Autowired ModelMapper mapper;

    private static AtomicInteger aInteger = new AtomicInteger(); //Thread-Safe
    private static SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmm");
    private static SimpleDateFormat sTimeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    private static DecimalFormat dFormat = new DecimalFormat("0000"); 

    private int getNextNum(){
        if(aInteger.get()>9999) aInteger.set(0); //Reset Any Thread this Valuse to 0
        return aInteger.incrementAndGet(); //Still this Thread-Safe
    }

    @Override
    public LogisticResponse createRecord(LogisticRequest request) {
        try{
            Logisticdto dto = mapper.map(request, Logisticdto.class);
           
            //dto.setId(1);
            dto.setTrackingNumber("ABC"+sDateFormat.format
            (new Timestamp(Calendar.getInstance().getTimeInMillis()).getTime())+dFormat.format(getNextNum()));
            dto.setTrackingNumberCreatedAt(TimestampToString(new Timestamp(Calendar.getInstance().getTimeInMillis())));
            

            Logisticdto sDto = logisticRepository.save(dto);

            return LogisticResponse
            .builder()
            .trackingNumber(sDto.getTrackingNumber())
            .createdAt(sDto.getTrackingNumberCreatedAt())
            .build();
        }catch(Exception err){
            System.out.println("Error creating logistic record @ service - "+err.getMessage());
        }
        return LogisticResponse.builder().build();
    }

    private String TimestampToString(java.sql.Timestamp timestamp){
        try{
            java.util.Date date = new java.util.Date();
            date.setTime(new Timestamp(Calendar.getInstance().getTimeInMillis()).getTime());
            return sTimeStamp.format(date);
        }catch(Exception e){
            return "";
        }
    }

    

}
