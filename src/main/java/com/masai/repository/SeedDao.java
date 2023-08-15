package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Seed;

@Repository
public interface SeedDao extends JpaRepository<Seed, Integer>{

	
	@Query("select s from Seed s where s.commonName = ?1")
	public List<Seed> getSeedBycommonName(String commonName);
	
	@Query("select s from Seed s where s.typeOfSeeds = ?1")
     public List<Seed> getSeedBytypeOfSeeds(String typeOfSeeds);
//	 public List<Seed> findBytypeOfSeeds(String typeOfSeeds);
	 
}
