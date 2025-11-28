package com.fullstack.zwigato.payment.repository;

import com.fullstack.zwigato.payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepsitory extends JpaRepository<Payment, Long> {
}
