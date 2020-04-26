package com.pbasco.driverslicense.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pbasco.driverslicense.models.License;

@Repository
public interface LicenseRepository extends CrudRepository <License, Long>{
	
	List<License> findTopByOrderByNumberDesc();
}
