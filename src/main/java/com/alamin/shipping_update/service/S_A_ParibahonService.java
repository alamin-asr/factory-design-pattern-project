package com.alamin.shipping_update.service;

import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class S_A_ParibahonService implements ShippingService{
    @Override
    public String ship(String orderId, String recipient, String address) {
        return "SAP-"+ UUID.randomUUID();
    }
}
