package com.devjapa.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjapa.dslearn.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
