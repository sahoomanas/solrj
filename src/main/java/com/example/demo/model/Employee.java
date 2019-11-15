package com.example.demo.model;


import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SolrDocument(collection="employee")
public class Employee {
	
	public Employee(int id, String name, String[] address) {
		this.id=id;
		this.name=name;
		this.address=address;
		// TODO Auto-generated constructor stub
	}
	@Id
	@Field
	private int id;
	@Field
	private String name;
	@Field
	private String[] address;

}
