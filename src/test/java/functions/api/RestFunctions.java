package functions.api;

import com.google.gson.JsonObject;
import functions.file.JSONHandler;
import io.restassured.RestAssured;

public class RestFunctions {

    public static JsonObject getRequestREST(String BASE_URI, String basePath){

        String response = RestAssured
                .given()
                    .baseUri(BASE_URI)
                    .basePath(basePath)
                .when()
                    .get()
                .then()
//                    .log().all()
                    .assertThat().statusCode(200)
                    .extract().response().jsonPath().prettify();

        System.out.println(response);
        return JSONHandler.parseJSONfromString(response);
    }

    public static JsonObject getRequestREST(String BASE_URI, String basePath, String param){

        String response = RestAssured
                .given()
                    .baseUri(BASE_URI)
                    .basePath(basePath)
                .when()
                    .get(param)
                .then()
//                    .log().all()
                    .assertThat().statusCode(200)
                    .extract().response().jsonPath().prettify();

//        System.out.println(response);
        return JSONHandler.parseJSONfromString(response);
    }
}
