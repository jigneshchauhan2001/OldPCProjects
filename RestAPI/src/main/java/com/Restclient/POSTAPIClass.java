package com.Restclient;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.resources.TestBase;

public class POSTAPIClass {

	public CloseableHttpResponse PostAPI(String uri, String entityString, HashMap<String, String> headerMap) throws ClientProtocolException, IOException {
		
		CloseableHttpClient httpClient =HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(uri);
		// before executing httpClient we will setENtity using setEntity method in httpPost
		
		// first created stringEntity Object and we need to pass that StringEntity Object in setEntity method.
		StringEntity stringEntity = new StringEntity(entityString); 
		httpPost.setEntity(stringEntity);
			
		for (Map.Entry<String, String> entry :headerMap.entrySet() ) {
			headerMap.put(entry.getKey(), entry.getValue());
		}
		
		 CloseableHttpResponse closeableHttpResponse=httpClient.execute(httpPost);
		 return closeableHttpResponse;	
	}
}
