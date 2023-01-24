package requestMethods;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequestMethod {
    
	Response response = null;
   
	@SuppressWarnings("unchecked")
	//@Test
    public void testCase_Post() {
        
        JSONObject request = new JSONObject();
        request.put("id", "25");
        request.put("name", "testing25");
        System.out.println("Request"+request);
        System.out.println("To string"+request.toJSONString());
        
        response = RestAssured.given().
        header("Content-Type","application/json").
        contentType(ContentType.JSON).
        accept(ContentType.JSON).
        body(request.toJSONString()).
        when().
        put("https://70ssu4a992.execute-api.us-west-2.amazonaws.com/items");
        
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(), 200);              

    }
   
	@SuppressWarnings("unchecked")
	@Test
	public void testPost_1() {
		RestAssured.baseURI = "https://9im32ep0x3.execute-api.us-east-2.amazonaws.com/test/execute";
		JSONObject request = new JSONObject();

		request.put("number", "4");
		System.out.println("Request"+request);
        System.out.println("To string"+request.toJSONString());

       
		response = RestAssured.given().header("Content-Type", "application/json").contentType(ContentType.JSON)
				.accept(ContentType.JSON).body(request.toJSONString()).when().post();
		System.out.println(response.getBody().asString());
		int statusCode = response.getStatusCode();
		System.out.println(response.getStatusCode());
		Assert.assertEquals(statusCode, 200);   

	}

}
