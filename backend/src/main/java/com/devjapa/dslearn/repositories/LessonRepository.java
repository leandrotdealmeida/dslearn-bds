package com.devjapa.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjapa.dslearn.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long> {

}
