package com.assignment.logistics.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class LogisticResponse {
    @JsonProperty("tracking_number") String trackingNumber;
    @JsonProperty("created_at") String createdAt;
}
