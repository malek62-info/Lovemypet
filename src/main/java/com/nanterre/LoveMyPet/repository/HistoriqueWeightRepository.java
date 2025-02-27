package com.nanterre.LoveMyPet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nanterre.LoveMyPet.model.HistoriqueWeight;

	

@Repository
public interface HistoriqueWeightRepository extends JpaRepository<HistoriqueWeight, Integer> {
	List<HistoriqueWeight> findByAnimalId(Integer animalId);
}
	