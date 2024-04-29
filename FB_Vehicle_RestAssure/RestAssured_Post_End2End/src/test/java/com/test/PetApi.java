package com.test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Payload.UserCreationPayload;
import Utility.Helper;

import static io.restassured.RestAssured.given;

import java.io.IOException;

public class PetApi {
	
	String FN ,LN,UN,Email;
	
	String PetDataPath = System.getProperty("user.dir")+"\\PayloadFile\\PetData.json";
	RequestSpecification  req = new RequestSpecBuilder().setBaseUri("https://petstore.swagger.io")
			.setContentType(ContentType.JSON).build();


    @BeforeClass
    public void Initalization()
    {
    	 FN = Helper.randomString(5);
    	 LN = Helper.randomString(5);
    	 UN = FN+LN;
    	 Email= UN+"@mailinator.com";
       // RestAssured.baseURI="https://petstore.swagger.io";
    }


    
    @Test (priority=1)
    public void PostUSerCreation() 
    {
    

        Response res = given().log().all().spec(req).body(UserCreationPayload.UserCreation(UN,FN,LN ,Email ))
                .when().post("/v2/user")
                .then().assertThat().statusCode(200).extract().response();

        System.out.println(res.asString());

    }
    
    
    
    @Test (priority=2)
    public void PostGetData()
    {
    	    	Response res = given().log().all().spec(req)
                .when().get("/v2/user/"+UN)
                .then().assertThat().statusCode(200).extract().response();

        System.out.println(res.asString());

    }

   @Test(priority=3)
	public void PostDelete()
	{
				
		Response res = given().log().all().spec(req)
                .when().delete("/v2/user/"+UN)
                .then().assertThat().statusCode(200).extract().response();
		
		System.out.println(res.asString());
		
	}
    
    
    
}
