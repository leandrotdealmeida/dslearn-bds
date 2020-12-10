package com.devjapa.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjapa.dslearn.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
