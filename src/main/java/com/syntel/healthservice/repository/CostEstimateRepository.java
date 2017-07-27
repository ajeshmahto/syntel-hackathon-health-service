package com.syntel.healthservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.syntel.healthservice.domain.CostEstimator;

@RepositoryRestResource
public interface CostEstimateRepository extends JpaRepository<CostEstimator, String>{
	
  public CostEstimator costEstimate(String treatmentName, String hospitalName);
}
