package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
public class EmployeeCoontroller {
	@Autowired
	private EmployeeRepository repository;
 
	@PostConstruct
	public void addEmployee() {
	 List<Employee> employees=new ArrayList();
	 employees.add(new Employee(373,"Ram",new String[] {"Fremont","CA"}));
	 employees.add(new Employee(374,"Hari",new String[] {"Milpitas","CA"}));
	 employees.add(new Employee(375,"Shyam",new String[] {"Sunnyvale","CA"}));
	 repository.saveAll(employees);
   }
	@GetMapping("/getAll")
	public Iterable<Employee> getAllEmployees() {
		return repository.findAll();
	}
	
	@GetMapping("/getEmp/{name}")
	public Employee getEmpployeByName(@PathVariable String name) {
		return repository.findByName(name);
		
	}
}
