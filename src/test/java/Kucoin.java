import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Kucoin {

    public static void main(String[] args) {


        Response response = RestAssured
                .given()
                    .baseUri("https://api.kucoin.com")
                    .basePath("/api/v1/prices")
                .when()
                    .get()
                .then()
//                    .log().all()
                    .assertThat().statusCode(200)
                    .extract().response();

        System.out.println(response.getBody().asString());
    }

}
