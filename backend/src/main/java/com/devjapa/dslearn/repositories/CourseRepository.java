package com.devjapa.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjapa.dslearn.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
