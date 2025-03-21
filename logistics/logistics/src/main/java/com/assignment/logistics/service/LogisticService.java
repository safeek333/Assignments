package com.assignment.logistics.service;

import org.springframework.stereotype.Service;
import com.assignment.logistics.request.LogisticRequest;
import com.assignment.logistics.request.LogisticResponse;

@Service
public interface LogisticService {

    public LogisticResponse createRecord(LogisticRequest request);

}
