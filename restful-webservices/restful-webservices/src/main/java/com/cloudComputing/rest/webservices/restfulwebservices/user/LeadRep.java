package com.cloudComputing.rest.webservices.restfulwebservices.user;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cloudComputing.rest.webservices.restfulwebservices.user.Lead;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface LeadRep extends CrudRepository<Lead, Long> {
	

}