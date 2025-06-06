package com.alamin.shipping_update.service;

import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class SundarbanService implements ShippingService{
    @Override
    public String ship(String orderId, String recipient, String address) {
        return "SB-"+ UUID.randomUUID();
    }
}
