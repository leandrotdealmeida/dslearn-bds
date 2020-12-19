package com.devjapa.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjapa.dslearn.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}
