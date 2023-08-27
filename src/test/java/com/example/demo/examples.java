package com.example.demo;

import io.restassured.http.ContentType;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class examples {

   @Test
    public void test_post() throws JSONException {
        JSONObject student = new JSONObject();
        student.put("name", "sriam");
        student.put("email", "sriam@gmail.com");
        student.put("dob", "1994-10-04");

        baseURI = "http://localhost:8080/";

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type", "application/json").
                body(student.toString()).
                when().
                post("api/v1/student").  // Update the endpoint accordingly
                then().
               // statusCode(200).
                log().all();
    }
    @Test
    public void test_put() throws JSONException {
        JSONObject student = new JSONObject();

        baseURI = "http://localhost:8080/api/v1/student/";

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type", "application/json").
                body(student.toString()).
        when().
                put("7?name=priya").  // Update the endpoint accordingly
        then().
                // statusCode(200).
                        log().all();
    }
   @Test
    public void test_delete() throws JSONException {
        JSONObject student = new JSONObject();

        baseURI = "http://localhost:8080/api/v1/student/";

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type", "application/json").
                body(student.toString()).
                when().
                delete("6").  // Update the endpoint accordingly
                then().
                //statusCode(200).
                        log().all();
    }
}







