package com.masai.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.SignUpData;

public interface SignUpDao extends JpaRepository<SignUpData, Integer> {

	public Optional<SignUpData> findByUserName(String userName);
	
	
	
}
