package getRequest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;





// 200 --> ok -- for GET 
// after deleting performed -- 204 (no content) will be returned
// 201 --> created -- for POST


public class getClass {

	/*
	@Test
	public void getMethod() {
		Response response =RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		String  body =response.getBody().asString();
		System.out.println("response body ---> " + body);	
		
		// getContentType() method returns content type of the response if found, else it returns null.
		String contenttype =response.getContentType();
		System.out.println("content type---> "+contenttype);
		
		// If the session ID is not defined, then getSessionID() returns null.
		String sessionId=response.getSessionId();
		System.out.println("session Id ---> " + sessionId);
		
		// 404 if the value is not found.
		int statusCode=response.getStatusCode();
		System.out.println("status code ---> " +statusCode);
		
		
		Assert.assertEquals(statusCode, 200, "Incorrect Status code Returned");
		
		// First part is Http protocol (HTTP/1.1). Second is Status Code (200). Third is the Status message (OK).
		// HTTP/1.1 200 OK
		String statusLine = response.getStatusLine();
		System.out.println("status Line ---> " +statusLine);
		
		
		// Headers 
		Headers headers =response.getHeaders();
		
		HashMap<String, String> headerMap = new HashMap();
		for (Header header : headers) {
			headerMap.put(header.getName(), header.getValue());
		}
		System.out.println("Headers ---->  " +headerMap);
		
		
//		for (Header header : headers) {
//			System.out.println("header name --> " +header.getName()   +"   header value -->  " +header.getValue());
//		}
		
		// getHeader with its name returns Header value.
		String firstheader =response.getHeader("Transfer-Encoding");
		System.out.println("Transfer Encoding Value ---> "  +firstheader);
		
		JsonPath jsonPath = response.jsonPath();
		//  returns ARRAY --> [{"id":300,"main":"Drizzle","description":"light intensity drizzle","icon":"09d"}]
		System.out.println(jsonPath.getString("weather"));
		// to get value inside that array
		// u can write weather.id or weather[0].id 
		System.out.println(jsonPath.getString("weather.id"));    // returns asnwer with [ ] 
		System.out.println(jsonPath.getString("weather[0].id"));
		System.out.println(jsonPath.getString("weather[0].main"));
		System.out.println(jsonPath.getString("weather[0].description"));
		System.out.println(jsonPath.getString("weather[0].icon"));	
	}
	
	
	
	@Test
	public void post() {
		
		// u can use baseURI as full and passing nothng in post --> https://reqres.in/api/users 
		RestAssured.baseURI = "https://reqres.in";
		
		RequestSpecification httpRequest=RestAssured.given();
		
		// 1st  -- add header
		httpRequest.header("Content-Type", "application/json");
		
		// 2nd -- create json object to add Parameters 
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("joseph", "senior leader");
		
		// then convert that json object to String as we can only pass String in httpRequest
		String jsonString = jsonObject.toString();
		
		// then add this JsonString to httpRequest.
		httpRequest.body(jsonString);
		
		
		// now make POST request
		Response response =httpRequest.post("/api/users");
		System.out.println(response.getStatusCode());
		
		
		// returns that entity added with id and time(createdAt).
		String body=response.getBody().asString();
		System.out.println("response body ---> " +body);
		
		// or u can use directly without getBody method.
		System.out.println(response.asString());	
	}
	*/
	
	@Test
	public void put() {
	
		RestAssured.baseURI = "https://reqres.in/api/users/2";
		RequestSpecification httpRequest =RestAssured.given();
			
		httpRequest.header("Content-Type", "application/json");
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Jignesh", "TESTENGINEER");
		
		String jsonString =jsonObject.toString();
		
		httpRequest.body(jsonString);
		
		Response response =httpRequest.put();
		
		System.out.println(response.getBody().asString());
		
		System.out.println(response.getStatusCode());
			
		Response res1 =RestAssured.get("https://reqres.in/api/users");
		System.out.println(res1.getBody().asString());
		
	}
	
	@Test
	public void patch()
	{
		RestAssured.baseURI = "https://reqres.in/api/users/2";
		RequestSpecification httpRequest =RestAssured.given();
		
		httpRequest.header("Content-Type", "application/json");
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("SUNILPATCHED", "AppDev");
		
		String jsonString =jsonObject.toString();
		
		httpRequest.body(jsonString);
		
		Response response =httpRequest.patch();
		
		System.out.println(response.getBody().asString());	
		System.out.println(response.getStatusCode());
		
		Response res1 =RestAssured.get("https://reqres.in/api/users");
		System.out.println(res1.getBody().asString());
	}
	
	
	
	
	
	
	
	
	
	
	/*
	
	@Test
	public void delete() {
	
		// first just checking this user
		Response response=RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(response.getBody().asString());
		
		// now we want to delete user with id 2, so uri will be like this we can write	
		Response response1=RestAssured.delete("https://reqres.in/api/users/2");
		System.out.println(response1.getStatusCode());
		
		// as we deleted it will print nothing
		System.out.println(response1.getBody().asString());
	}
	
	
	
	@Test
	public void postDuplicate()
	{
		RestAssured.baseURI = "https://reqres.in/api/users";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.header("Content-Type", "application/json");
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Jignesh", "Trainee");
		jsonObject.put("Sunil", "SE");
		
		String jsonString=jsonObject.toString();
		
		// now adding that jsonString to httpRequest
		httpRequest.body(jsonString);
		
		Response response = httpRequest.post();
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
	}
	
	
	
	
	@Test
	public void duplicateGetMethod()
	{
		// u can divide entire URI in 2 parts baseURI and Query parameter. 
		RestAssured.baseURI = "https://samples.openweathermap.org/data/2.5/";
		
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.request(Method.GET, "weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		String  body =response.getBody().asString();
		System.out.println(body);
	}
	
	
	@Test
	public void duplicateGetMethodUsingExcel() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Training\\FilereadingRestAssured\\restAssuredAPIs.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet =wb.getSheet("Sheet1");
		
		String baseURL=sheet.getRow(1).getCell(0).getStringCellValue();
		String URI = sheet.getRow(1).getCell(1).getStringCellValue();
		
		Response response=RestAssured.get(baseURL + URI);
		String body=response.getBody().asString();
		System.out.println("Response body ---> " +body);
		
	}
	*/
	
	
}
