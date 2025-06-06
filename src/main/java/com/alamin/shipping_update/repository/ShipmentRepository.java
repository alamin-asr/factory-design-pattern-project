package com.alamin.shipping_update.repository;

import com.alamin.shipping_update.entity.Shipment;
import com.alamin.shipping_update.enums.ShippingProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
 List<Shipment> findByShippingProvider(ShippingProvider provider);

}
