package com.fullstack.zwigato.order.repository;

import com.fullstack.zwigato.order.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
