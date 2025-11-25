package com.fullstack.zwigato.email_notification.repository;

import com.fullstack.zwigato.email_notification.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
