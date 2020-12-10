package com.devjapa.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjapa.dslearn.entities.Section;

public interface SectionRepository extends JpaRepository<Section, Long> {

}
