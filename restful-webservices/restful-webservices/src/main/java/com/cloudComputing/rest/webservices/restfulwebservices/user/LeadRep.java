package com.cloudComputing.rest.webservices.restfulwebservices.user;


import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cloudComputing.rest.webservices.restfulwebservices.user.Lead;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface LeadRep extends CrudRepository<Lead, String> {
	 @Modifying(clearAutomatically = true)
	 @Query(value = "insert into lead(ID,Phone,Name) values (3,001,joey)", nativeQuery = true)  
	 List<Lead> setTestID(@Param("id") String id);
}