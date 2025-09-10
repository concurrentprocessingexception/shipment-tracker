package com.example.genai.external.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShipmentDetails {

    private String shipmentId;
    private String shipmentDescription;
    private String expectedDeliveryDate;
    private String actualDeliveryDate;
    private String deliveryCharges;
    private boolean isFragile;
}
