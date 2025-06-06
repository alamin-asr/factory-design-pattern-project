package com.alamin.shipping_update.entity;

import com.alamin.shipping_update.enums.ShippingProvider;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;
    private String orderId;
    private String recipient;
    private String address;

    @Enumerated(EnumType.STRING)
    private ShippingProvider shippingProvider;

    private String trackingNumber;
    private String status;
    private LocalDateTime shippedAt;


}
