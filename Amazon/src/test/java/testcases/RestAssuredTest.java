package testcases;

import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.containsString;

public class RestAssuredTest {
    @DataProvider(name = "UserDetails")
    public  Object[][] UserDetails() {
        return new Object[][]{
                {"admin", "admin"},
                {"ronaldo", "player"}
        };


    }
//data provider fo POJOTest USer
    @DataProvider(name = "POJOtestUser")
    public  Object[][] POJOtestUser() {
        return new Object[][]{
                {"admin", "admin"},
                {"ronaldo", "player"}
        };
    };



    @Test(dataProvider = "UserDetails")
    public void CreateUser(String name, String job){
        RestAssured.baseURI = "https://reqres.in";
        File schema = new File(System.getProperty("user.dir")+"\\schema.json");
        JSONObject request = new JSONObject();
        request.put("name", name);
        request.put("job", job);



        String response = given().log().all().header("Content-Type","application/json")


                .body(request)
                .when().post("api/users")
                .then().assertThat().statusCode(201)
                .header("Content-Type",containsString("application/json"))
                .body(matchesJsonSchema(schema))
                //.time(Matchers.lessThanOrEqualTo(2000L))
                .extract().response().asString();


        ReusableMethod.rawToJson(response);


    }
    @Test

    public void POJO() {
        JSONObject request = new JSONObject();
        request.put("name", "name");
        request.put("job", "job");
        RequestSpecification request1 = RestAssured.given().log().all().header("Content-Type","application/json");

       request1.body(request);
        ResponseBody response =request1.post("api/users").getBody();
       JSONSuccessResponse responseBody = response.as(JSONSuccessResponse.class);


    }
}
