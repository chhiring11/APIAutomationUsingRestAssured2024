package apiAutomationUsingRestAssured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ValidateDeleteRequest {

    public String urlDeleteRequest = "https://fakerestapi.azurewebsites.net/api/v1/Users/11";

    @Test
    public void VerifyResponseCodeForDeleteRequest(){
        given()
                .when()
                .delete(urlDeleteRequest)
                .then()
                .statusCode(200)
                .log()
                .body();

    }

}
