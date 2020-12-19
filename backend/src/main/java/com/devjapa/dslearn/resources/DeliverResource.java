package com.devjapa.dslearn.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devjapa.dslearn.dto.DeliverRevisionDTO;
import com.devjapa.dslearn.services.DeliverService;

@RestController
@RequestMapping(value = "/deliveries")
public class DeliverResource {
	
	@Autowired
	private DeliverService deliverSeervice;
	
	@PreAuthorize("hasAnyRole('ADMIN', 'INSTRUCTOR')")
	@PutMapping(value = "/{id}")
	public ResponseEntity<Void> saveDeliverRevision(@PathVariable Long id,@RequestBody DeliverRevisionDTO dto) {
		deliverSeervice.saveDeliverRevision(id, dto);
		return ResponseEntity.noContent().build();
	}

}
