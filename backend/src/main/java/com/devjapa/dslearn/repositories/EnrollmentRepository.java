package com.devjapa.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjapa.dslearn.entities.Enrollment;
import com.devjapa.dslearn.entities.pk.EnrollmentPK;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {

}
