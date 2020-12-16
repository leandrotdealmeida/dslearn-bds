package com.devjapa.dslearn.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devjapa.dslearn.entities.Notification;
import com.devjapa.dslearn.entities.User;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
	
	@Query("SELECT obj FROM Notification obj WHERE "
			+ "(obj.user = :user) AND "
			+ "(obj.read = :read) "
			+ "ORDER BY obj.moment DESC")
	Page<Notification> find(User user, boolean read, Pageable pageable);

}
