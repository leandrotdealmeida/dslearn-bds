package com.devjapa.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjapa.dslearn.entities.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
