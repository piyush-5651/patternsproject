package com.piyushAssign.DMS.repository;

/**
 * @author: Piyush Jain (s565127)
 **/

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.piyushAssign.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
}
