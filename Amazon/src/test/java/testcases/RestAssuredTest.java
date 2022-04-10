package testcases;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.containsString;

public class RestAssuredTest {
    @Test
    public void CreateUser(){
        RestAssured.baseURI = "https://reqres.in";
        File schema = new File(System.getProperty("user.dir")+"\\schema.json");



        String response = given().log().all().header("Content-Type","application/json")
                .body(Payload.CreateDynamicUser("admin","admin"))
                .when().post("api/users")
                .then().assertThat().statusCode(201)
                .header("Content-Type",containsString("application/json"))
                .body(matchesJsonSchema(schema))
                //.time(Matchers.lessThanOrEqualTo(2000L))
                .extract().response().asString();


        ReusableMethod.rawToJson(response);

    }
