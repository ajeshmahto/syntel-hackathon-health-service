package com.syntel.healthservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.syntel.healthservice.domain.Symptoms;

@RepositoryRestResource
public interface SymptomsRepository extends JpaRepository<Symptoms, String>{
	

}