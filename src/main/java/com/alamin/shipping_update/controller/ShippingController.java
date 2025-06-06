package com.alamin.shipping_update.controller;

import com.alamin.shipping_update.entity.Shipment;
import com.alamin.shipping_update.enums.ShippingProvider;
import com.alamin.shipping_update.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/shipment")
public class ShippingController {
    @Autowired
    private ShipmentRepository shipmentRepository;
@PostMapping("entry")
public ResponseEntity<Shipment> createShipment(@RequestBody Shipment shipment) {
    if(shipment.getShippedAt() == null) {
        shipment.setShippedAt(LocalDateTime.now());
    }
    Shipment savedShipment=shipmentRepository.save(shipment);
    return new ResponseEntity<>(savedShipment, HttpStatus.CREATED);
}
    @GetMapping("/{status}")
    private ResponseEntity<List<Shipment>> getShipmentByProvider(@PathVariable String status) {

        List<Shipment>shipments=shipmentRepository.findByShippingProvider(ShippingProvider.valueOf(status.toUpperCase()));
        return ResponseEntity.ok(shipments);
    }
    @GetMapping("allShipment")
    private ResponseEntity<List<Shipment>> getAllShipment() {
    List<Shipment>shipments=shipmentRepository.findAll();
    return ResponseEntity.ok(shipments);
    }
}
