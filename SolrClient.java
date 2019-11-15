import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.solr.client.*;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.params.MapSolrParams;
public class SolrClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new SolrClient().queryTechProducts();
		} catch (SolrServerException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  public HttpSolrClient getSolrClient() {
	  final String solrUrl = "http://localhost:8983/solr";
	  return new HttpSolrClient.Builder(solrUrl)
	      .withConnectionTimeout(10000)
	      .withSocketTimeout(60000)
	      .build();
  }
  public void queryTechProducts() throws SolrServerException, IOException {
	  
	  HttpSolrClient httpSolrClient= getSolrClient();
	  
	  final Map<String, String> queryParamMap = new HashMap<String, String>();
	  queryParamMap.put("q", "*:*");
	  queryParamMap.put("fl", "id, name");
	  MapSolrParams queryParams = new MapSolrParams(queryParamMap);
	  
	  final QueryResponse response = httpSolrClient.query("techproducts", queryParams);
	  final SolrDocumentList documents = response.getResults();
	  
	  for(SolrDocument document : documents) {
		  System.out.println(document.getFieldNames()+" : "+document.getFieldValue("id")+" :: "+document.getFieldValue("name"));
		  
		}
	  
	  
  }
}
