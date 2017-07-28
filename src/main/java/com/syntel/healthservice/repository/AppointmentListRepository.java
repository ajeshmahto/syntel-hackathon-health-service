package com.syntel.healthservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syntel.healthservice.domain.AppointmentList;

public interface AppointmentListRepository extends JpaRepository<AppointmentList, String>{

}
