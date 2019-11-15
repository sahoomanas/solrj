# solrj
SolrJ

Spring Boot + Spring Data Solr

Step 1: 

C:\solr-8.3.0\bin>solr create_collection -c employee
WARNING: Using _default configset with data driven schema functionality. NOT RECOMMENDED for production use.
         To turn off: bin\solr config -c employee -p 8983 -action set-user-property -property update.autoCreateFields -value false

Created new core 'employee'

Step 2 : 

Spring Data java using SolrCrudRepository<Employee, Integer> repository
