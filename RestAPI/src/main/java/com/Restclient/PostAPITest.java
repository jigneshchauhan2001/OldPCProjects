package com.Restclient;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.resources.TestBase;

public class PostAPITest extends TestBase {

	TestBase testBase;
	String url;
	String serviceUrl;
	String uri;
	POSTAPIClass postClassObject;
	CloseableHttpResponse closeableHttpResponse;

	
	@Test
	public void PostAPITest() throws JsonGenerationException, JsonMappingException, IOException { 
		
		postClassObject = new POSTAPIClass();
		
		HashMap<String, String> headerMap = new HashMap();
		headerMap.put("Content-Type", "application/json");

		// Now we need already added JacksonAPI & FasterXml dependencies which will convert POJO to Json File
		ObjectMapper mapper = new ObjectMapper();
		Users users = new Users("abc", "leader");
		
		
		// mapper.writeValue will write value of java object to given Json File
		mapper.writeValue(new File("C:\\Users\\jigne\\eclipse-workspace\\RestAPI\\src\\main\\java\\com\\Restclient\\UsersFile.json"), users);
		
		// above writing in JsonFile from java object is for demo only. 
		// while in post method we have to pass ---> jsonString or EntityStirng
		
		// now we will send this userJsonString in post call.
		// Post call take JsonString as BODY, and it will return response 
		// userJsonString --> also called as EntityString
		//
		String userJsonString=mapper.writeValueAsString(users);
		System.out.println(userJsonString);
		closeableHttpResponse=postClassObject.PostAPI(uri, userJsonString, headerMap);
	
		
		//now we have closeableHttpResponse from it we can get JsonString and JsonObject and
		 
		//getting values from closeableHttpResponse
		int statusCode =closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println(statusCode);
		
		// now we want JsonString or EntityString from that closeableHttpResponse
		String ResponseJsonString=EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
		 System.out.println(ResponseJsonString);
		
		// now we will get JsonObject from that JsonResponseString
		JSONObject jsonResponseObject = new JSONObject(ResponseJsonString);
		System.out.println(jsonResponseObject);
		
		// now we want to read value from that RsponseJsonString
		Users userResponseObject = mapper.readValue(ResponseJsonString, Users.class);
		
		System.out.println(userResponseObject);
		
		System.out.println(userResponseObject.getName());
		System.out.println(userResponseObject.getJob());
	}
	
	
	
	
	
	@BeforeMethod
	public void beforeMethod() {

		testBase = new TestBase();
		url = prop.getProperty("URL");
		serviceUrl = prop.getProperty("serviceURL");
		uri = url + serviceUrl;
	}
	
	
	

}
