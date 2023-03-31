package com.jobin.nhs;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PeopleRepository extends PagingAndSortingRepository<People, Long>, CrudRepository<People,Long> {

	  List<People> findByLastName(@Param("name") String name);

	}
