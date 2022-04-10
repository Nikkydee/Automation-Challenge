package testcases;

import io.restassured.path.json.JsonPath;

public class ReusableMethod {
    public static JsonPath rawToJson(String response) {
        JsonPath jP = new JsonPath(response);
        return jP;
    }
}