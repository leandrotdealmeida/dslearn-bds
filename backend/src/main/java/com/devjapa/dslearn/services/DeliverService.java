package com.devjapa.dslearn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devjapa.dslearn.dto.DeliverRevisionDTO;
import com.devjapa.dslearn.entities.Deliver;
import com.devjapa.dslearn.repositories.DeliverRepository;

@Service
public class DeliverService {
	
	@Autowired
	private DeliverRepository deliverRepository;
	
	@Autowired
	private NotificationService notificationService;
	
	@Transactional
	public void saveDeliverRevision(Long id, DeliverRevisionDTO dto) {
		Deliver deliver = deliverRepository.getOne(id);
		deliver.setStatus(dto.getStatus());
		deliver.setFeedback(dto.getFeedback());
		deliver.setCorrectCount(dto.getCorrectCount());
		deliverRepository.save(deliver);
		notificationService.saveDeliverNotification(deliver);
	}

}
