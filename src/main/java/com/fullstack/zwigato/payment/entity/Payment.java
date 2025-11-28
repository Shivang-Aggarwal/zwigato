package com.fullstack.zwigato.payment.entity;

import com.fullstack.zwigato.auth_users.entity.User;
import com.fullstack.zwigato.enums.PaymentGateway;
import com.fullstack.zwigato.enums.PaymentStatus;
import com.fullstack.zwigato.order.entity.Order;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "payments")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    private String transactionId;

    @Enumerated(EnumType.STRING)
    private PaymentGateway paymentGateway;

    private String failureReason;

    private LocalDateTime localDateTime;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // the user who made the payment

}
