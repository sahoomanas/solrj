# solrj
SolrJ

SolrClient.java
================
step 1 : C:\solr-8.3.0\bin>Solr start

step 2: C:\solr-8.3.0\bin>Solr -e techproducts -p 8983

step 3: run SolrClient


Spring Boot + Spring Data Solr
==============================
Step 1: 

C:\solr-8.3.0\bin>solr create_collection -c employee
WARNING: Using _default configset with data driven schema functionality. NOT RECOMMENDED for production use.
         To turn off: bin\solr config -c employee -p 8983 -action set-user-property -property update.autoCreateFields -value false

Created new core 'employee'

Step 2 : 

Spring Boot with spring Data using SolrCrudRepository<Employee, Integer> repository
