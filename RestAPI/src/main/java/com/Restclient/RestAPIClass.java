package com.Restclient;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestAPIClass {

	
	// import all import statements from --> org.apache
	public CloseableHttpResponse getAPI(String uri) throws ClientProtocolException, IOException {
		
		// -----
		CloseableHttpClient httpClient =HttpClients.createDefault();
		// pass that uri in HttpGet method
		HttpGet httpGet = new HttpGet(uri);
		// after loading uri in get method, EXECUTE THAT CLIENT using HTTPGET
		 CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpGet);
		 
		 
		 return closeableHttpResponse;
	}
	
	
public CloseableHttpResponse getAPI(String uri, HashMap<String, String> headerMap) throws ClientProtocolException, IOException {
		
		// -----
		CloseableHttpClient httpClient =HttpClients.createDefault();
		// pass that uri in HttpGet method
		HttpGet httpGet = new HttpGet(uri);
		
		// Now before Executing we will adjust that headerMap in httpGet MEthod. 
		// so we will add one by one all header which are in hashMap using httpGet method.
		for (Map.Entry<String, String> header : headerMap.entrySet()) {
			httpGet.addHeader(header.getKey(), header.getValue());
		}
	
		// after loading uri in get method, EXECUTE THAT CLIENT using HTTPGET
		 CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpGet);
		 return closeableHttpResponse;
	}


}
