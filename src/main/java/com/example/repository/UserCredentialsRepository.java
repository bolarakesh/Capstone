package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.UserCredentials;

public interface UserCredentialsRepository extends JpaRepository<UserCredentials, Integer>{

}
