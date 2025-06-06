package com.alamin.shipping_update.service;

import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class DhlService implements ShippingService {


    @Override
    public String ship(String orderId, String recipient, String address) {
        return "DHL-"+ UUID.randomUUID();
    }
}
