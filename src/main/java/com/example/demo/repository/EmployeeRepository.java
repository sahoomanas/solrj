package com.example.demo.repository;

import org.springframework.data.solr.repository.SolrCrudRepository;

import com.example.demo.model.Employee;

public interface EmployeeRepository extends SolrCrudRepository<Employee, Integer>{

	Employee findByName(String name);

}
