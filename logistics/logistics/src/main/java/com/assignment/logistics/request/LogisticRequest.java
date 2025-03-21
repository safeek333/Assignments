package com.assignment.logistics.request;
import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class LogisticRequest {
    long id;
    @JsonProperty("origin_country_id") String originCountryId;
    @JsonProperty("destination_country_id") String destinationCountryId;
    @JsonProperty("weight") double weight;
    @JsonProperty("created_at") String createdAt;
    @JsonProperty("customer_id") String customerId;
    @JsonProperty("customer_name") String customerName;
    @JsonProperty("customer_slug") String customerSlug;


}
