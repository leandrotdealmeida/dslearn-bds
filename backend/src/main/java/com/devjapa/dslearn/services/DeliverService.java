package com.devjapa.dslearn.services;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devjapa.dslearn.dto.DeliverRevisionDTO;
import com.devjapa.dslearn.entities.Deliver;
import com.devjapa.dslearn.observers.DeliverRevisionObserver;
import com.devjapa.dslearn.repositories.DeliverRepository;

@Service
public class DeliverService {
	
	@Autowired
	private DeliverRepository deliverRepository;
	
	private Set<DeliverRevisionObserver> deliverRevisionObervers = new LinkedHashSet<>();
	
	@Transactional
	public void saveDeliverRevision(Long id, DeliverRevisionDTO dto) {
		Deliver deliver = deliverRepository.getOne(id);
		deliver.setStatus(dto.getStatus());
		deliver.setFeedback(dto.getFeedback());
		deliver.setCorrectCount(dto.getCorrectCount());
		deliverRepository.save(deliver);
		
		deliverRevisionObervers.forEach(obs -> obs.onSaveRevision(deliver));
	}
	
	public void subscribeDeliverRevisionObserver(DeliverRevisionObserver observer) {
		deliverRevisionObervers.add(observer);
	}

}
