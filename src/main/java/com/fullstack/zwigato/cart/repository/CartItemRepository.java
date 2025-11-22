package com.fullstack.zwigato.cart.repository;

import com.fullstack.zwigato.cart.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {



}
