package com.Restclient;

import org.testng.annotations.Test;
import com.resources.TestBase;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class GetTestAPI extends TestBase {
	TestBase testBase;
	String url;
	String serviceUrl;
	String uri;
//	RestAPIClass restAPIObject;
//	CloseableHttpResponse closeableHttpResponse;

	
	@Test(priority = 0)
	public void withoutHeader() throws ClientProtocolException, IOException {
		RestAPIClass restAPIObject;
		CloseableHttpResponse closeableHttpResponse;
		
		
		restAPIObject = new RestAPIClass();
		closeableHttpResponse = restAPIObject.getAPI(uri);

		// ------
		// NOW ---> closeableHttpResponse has 3 things : 1.statusCode, 2.JsonString,
		// 3.All Headers

		// 1 getting StatsusCode.
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		//System.out.println("Status Code ---> " + statusCode);
		Assert.assertEquals(statusCode, 200);

		// 2 Response String
		// returns entity ----> closeableHttpResponse.getEntity();
		// u need to convert that entity to string using toSting format and u can use
		// UTF_8 format.
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
		//System.out.println("Response String ----> " + responseString);

		// U can now get JsonObject (thatswhy we used that dependency) AND print it.
		JSONObject jsonResponse = new JSONObject(responseString);
		//System.out.println("Json Response ----> " + jsonResponse);

		// 3
		Header[] headers = closeableHttpResponse.getAllHeaders();
		//System.out.println(headers);

		HashMap<String, String> hashMap = new HashMap();
		for (Header header : headers) {
			hashMap.put(header.getName(), header.getValue());
		}
		//System.out.println("Headers----> " + hashMap);
		
		
		
		// Now we will get Json Objects (single values) & Json Array(set of values) from  Json Response.
		//1. Single Json Objects from Json Response.
		// to get Values from Json Response we will use getValueFromJsonResponse method.
		
		// here u can use /per_page or only per_page --> for single values
		String perPage=TestUtil.getValueFromJsonResponse(jsonResponse, "/per_page");
		//System.out.println(perPage);		
		Assert.assertEquals(Integer.parseInt(perPage), 6);
		
		String total = TestUtil.getValueFromJsonResponse(jsonResponse, "/total");
		Assert.assertEquals(Integer.parseInt(total), 12);
		
		
		// 2. Array from Json Response
		String lastname=TestUtil.getValueFromJsonResponse(jsonResponse, "/data[0]/last_name");
		Assert.assertEquals(lastname, "Bluth");
		
		String id=TestUtil.getValueFromJsonResponse(jsonResponse, "/data[0]/id");
		Assert.assertEquals(id, "1");
		
		String avatar=TestUtil.getValueFromJsonResponse(jsonResponse, "/data[0]/avatar");
		//System.out.println(avatar);
		
		String firstname=TestUtil.getValueFromJsonResponse(jsonResponse, "/data[0]/first_name");
		Assert.assertEquals(firstname, "George");	
	}
	
	
	@Test(priority = 1)
	public void withHeader() throws ClientProtocolException, IOException {
		RestAPIClass restAPIObject;
		CloseableHttpResponse closeableHttpResponse;
		
		
		restAPIObject = new RestAPIClass();
		
		HashMap<String, String> headerMap = new HashMap();
		headerMap.put("Content-Type", "application/json");

		closeableHttpResponse = restAPIObject.getAPI(uri, headerMap);
		
		// ------
				// NOW ---> closeableHttpResponse has 3 things : 1.statusCode, 2.JsonString,
				// 3.All Headers

				// 1 getting StatsusCode.
				int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
				//System.out.println("Status Code ---> " + statusCode);
				Assert.assertEquals(statusCode, 200);

				// 2 Response String
				// returns entity ----> closeableHttpResponse.getEntity();
				// u need to convert that entity to string using toSting format and u can use
				// UTF_8 format.
				String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
				//System.out.println("Response String ----> " + responseString);

				// U can now get JsonObject (thatswhy we used that dependency) AND print it.
				JSONObject jsonResponse = new JSONObject(responseString);
				//System.out.println("Json Response ----> " + jsonResponse);

				// 3
				Header[] headers = closeableHttpResponse.getAllHeaders();
				//System.out.println(headers);

				HashMap<String, String> hashMap = new HashMap();
				for (Header header : headers) {
					hashMap.put(header.getName(), header.getValue());
				}
				//System.out.println("Headers----> " + hashMap);
				
				
				
				// Now we will get Json Objects (single values) & Json Array(set of values) from  Json Response.
				//1. Single Json Objects from Json Response.
				// to get Values from Json Response we will use getValueFromJsonResponse method.
				
				// here u can use /per_page or only per_page --> for single values
				String perPage=TestUtil.getValueFromJsonResponse(jsonResponse, "/per_page");
				//System.out.println(perPage);		
				Assert.assertEquals(Integer.parseInt(perPage), 6);
				
				String total = TestUtil.getValueFromJsonResponse(jsonResponse, "/total");
				Assert.assertEquals(Integer.parseInt(total), 12);
				
				
				// 2. Array from Json Response
				String lastname=TestUtil.getValueFromJsonResponse(jsonResponse, "/data[0]/last_name");
				Assert.assertEquals(lastname, "Bluth");
				
				String id=TestUtil.getValueFromJsonResponse(jsonResponse, "/data[0]/id");
				Assert.assertEquals(id, "1");
				
				String avatar=TestUtil.getValueFromJsonResponse(jsonResponse, "/data[0]/avatar");
				//System.out.println(avatar);
				
				String firstname=TestUtil.getValueFromJsonResponse(jsonResponse, "/data[0]/first_name");
				Assert.assertEquals(firstname, "George");	
	} 
	
	

	@BeforeMethod
	public void beforeMethod() {

		 testBase = new TestBase();
		url = prop.getProperty("URL");
		serviceUrl = prop.getProperty("serviceURL");
		uri = url + serviceUrl;
	}
}
