package com.pbasco.driverslicense.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pbasco.driverslicense.models.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

	List<Person> findAll();	
}