/*
 * @Author Manoj Vamanaguntla
 */
package com.manojv.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.manojv.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	
	List<Dog> findByName(String name);

}
