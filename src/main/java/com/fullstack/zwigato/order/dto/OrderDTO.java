package com.fullstack.zwigato.order.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fullstack.zwigato.auth_users.dto.UserDTO;
import com.fullstack.zwigato.enums.OrderStatus;
import com.fullstack.zwigato.enums.PaymentStatus;
import com.fullstack.zwigato.order.entity.OrderItem;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderDTO {

    private Long id;

    private LocalDateTime localDateTime;

    private BigDecimal totalAmount;

    private OrderStatus orderStatus;

    private PaymentStatus paymentStatus;

    private UserDTO userDTO; // Customer who is ordering

    private List<OrderItemDTO> orderItems;
}
