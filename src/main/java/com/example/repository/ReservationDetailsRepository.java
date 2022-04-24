package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.ReservationDetails;
@Repository
public interface ReservationDetailsRepository extends  JpaRepository<ReservationDetails, Integer>{

}
