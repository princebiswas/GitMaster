package com.test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

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


    @BeforeMethod
    public void Initalization()
    {
    	 FN = Helper.randomString(5);
    	 LN = Helper.randomString(5);
    	 UN = FN+LN;
    	 Email= UN+"@mailinator.com";
       // RestAssured.baseURI="https://petstore.swagger.io";
    }

    @Test
    public void getData()
    {
    	    	


        Response res = given().log().all().spec(req).queryParam("status","available")
                .when().get("/v2/pet/findByStatus")
                .then().assertThat().statusCode(200).extract().response();

        System.out.println(res.asString());

    }

    @Test
    public void PostData() throws IOException
    {
//    String b = "{\n" +
//            "  \"id\": 0,\n" +
//            "  \"category\": {\n" +
//            "    \"id\": 0,\n" +
//            "    \"name\": \"PeagionBabiess\"\n" +
//            "  },\n" +
//            "  \"name\": \"PPPBaby\",\n" +
//            "  \"photoUrls\": [\n" +
//            "    \"string\"\n" +
//            "  ],\n" +
//            "  \"tags\": [\n" +
//            "    {\n" +
//            "      \"id\": 0,\n" +
//            "      \"name\": \"PegionBaby\"\n" +
//            "    }\n" +
//            "  ],\n" +
//            "  \"status\": \"sold\"\n" +
//            "}";

        Response res = given().log().all().spec(req).body(Helper.ReadStaticJson(PetDataPath))
                .when().post("/v2/pet")
                .then().assertThat().statusCode(200).extract().response();

        System.out.println(res.asString());
        
        String resdata = res.asString();
        
        JsonPath js = new JsonPath(resdata);
        
        String PetName =  js.get("category.name");  // to see the name, we need to fetch it with Json path.
       
        System.out.println(PetName);

    }
    
    @Test
    public void PostUSerCreation() 
    {
    

        Response res = given().log().all().spec(req).body(UserCreationPayload.UserCreation(UN,FN,LN ,Email ))
                .when().post("/v2/user")
                .then().assertThat().statusCode(200).extract().response();

        System.out.println(res.asString());
        
        

    }
}
