package com.jira;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Payload.PayloadServices;
import Resources.ResourcesServices;
import Utility.Helper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class EndToEndScript {
	
	String  AuthName;
	String  AuthValue;
	String Id;
	
	String LoginJsonPath = System.getProperty("user.dir")+"\\PayloadFile\\Login.json";
	
//	@BeforeMethod
	public void Initalization()
	{
		RestAssured.baseURI="http://localhost:8080";
	}
	
	@Test (priority=1)
	public void loginWithUNPass() throws IOException
	{
				
		Response res = given().log().all().contentType(ContentType.JSON).body(Helper.ReadStaticJson(LoginJsonPath))
                .when().post(ResourcesServices.LoginResources())
                .then().assertThat().statusCode(200).extract().response();

        System.out.println(res.asString());
        
        String Auth = res.asString();
        
        JsonPath js = new JsonPath(Auth);
        
        AuthName =  js.get("session.name");
       
        AuthValue = js.get("session.value");
       
       System.out.println(AuthName+"="+AuthValue);
       
		
		
	}
	
	@Test(priority=2)
	public void getIssue()
	{
		Response res = given().log().all().contentType(ContentType.JSON).header("cookie","JSESSIONID="+AuthValue)
                .when().get(ResourcesServices.getIssue("AUT-1"))
                .then().assertThat().statusCode(200).extract().response();
		
		System.out.println(res.asString());
	}
	
	@Test(priority=3)
	public void PostComment()
	{
		String b = "{\r\n"
				+ "    \"body\": \"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eget venenatis elit. Duis eu justo eget augue iaculis fermentum. Sed semper quam laoreet nisi egestas at posuere augue semper.\",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}";
		
		Response res = given().log().all().contentType(ContentType.JSON).header("cookie","JSESSIONID="+AuthValue).body(b)
                .when().post("/rest/api/2/issue/AUT-1/comment")
                .then().assertThat().statusCode(201).extract().response();
		
		System.out.println(res.asString());
	}
	
	@Test(priority=4)
	public void getComment()
	{
		
		
		Response res = given().log().all().contentType(ContentType.JSON).header("cookie","JSESSIONID="+AuthValue)
                .when().get("/rest/api/2/issue/AUT-1/comment")
                .then().assertThat().statusCode(200).extract().response();
		
		System.out.println(res.asString());
		String Auth = res.asString();
        
        JsonPath js = new JsonPath(Auth);
        
         Id = js.get("comments[0].id");
         
         System.out.println("Id of comment "+Id);
	}
	
	@Test(priority=5)
	public void DeleteComment()
	{
		
		
		Response res = given().log().all().contentType(ContentType.JSON).header("cookie","JSESSIONID="+AuthValue)
                .when().delete("/rest/api/2/issue/AUT-1/comment/"+Id)
                .then().assertThat().statusCode(204).extract().response();
		
		System.out.println(res.asString());
		
	}

}
