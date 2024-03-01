package com.test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetApi {

    @BeforeMethod
    public void Initalization()
    {
        RestAssured.baseURI="https://petstore.swagger.io";
    }

    @Test
    public void getData()
    {


        Response res = given().contentType(ContentType.JSON).queryParam("status","available")
                .when().get("/v2/pet/findByStatus")
                .then().assertThat().statusCode(200).extract().response();

        System.out.println(res.asString());

    }

    @Test
    public void PostData()
    {
    String b = "{\n" +
            "  \"id\": 0,\n" +
            "  \"category\": {\n" +
            "    \"id\": 0,\n" +
            "    \"name\": \"PeagionBabiess\"\n" +
            "  },\n" +
            "  \"name\": \"PPPBaby\",\n" +
            "  \"photoUrls\": [\n" +
            "    \"string\"\n" +
            "  ],\n" +
            "  \"tags\": [\n" +
            "    {\n" +
            "      \"id\": 0,\n" +
            "      \"name\": \"PegionBaby\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"status\": \"sold\"\n" +
            "}";

        Response res = given().log().all().contentType(ContentType.JSON).body(b)
                .when().post("/v2/pet")
                .then().assertThat().statusCode(200).extract().response();

        System.out.println(res.asString());
        
        String resdata = res.asString();
        
        JsonPath js = new JsonPath(resdata);
        
       String PetName =  js.get("category.name");  // to see the name, we need to fetch it with Json path.
       
       System.out.println(PetName);

    }
}
