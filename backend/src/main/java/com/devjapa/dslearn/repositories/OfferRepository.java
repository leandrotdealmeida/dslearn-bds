package com.devjapa.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjapa.dslearn.entities.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long> {

}
