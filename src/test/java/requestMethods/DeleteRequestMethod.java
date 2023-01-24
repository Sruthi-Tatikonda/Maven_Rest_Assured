package requestMethods;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteRequestMethod {

	@Test
    public void testcase_delete() {
        
        RestAssured.when().
        delete("https://70ssu4a992.execute-api.us-west-2.amazonaws.com/items/25").
        then().
        statusCode(200).
        log().all();
    }
}
