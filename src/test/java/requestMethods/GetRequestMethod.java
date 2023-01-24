package requestMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetRequestMethod {
    
    @Test
    public void testGet_2() {
        
        Response response = RestAssured.get("https://70ssu4a992.execute-api.us-west-2.amazonaws.com/items/2");

        System.out.println("Response is :");
        System.out.println(response.asString());
        System.out.println("Status code : "+response.getStatusCode());
        System.out.println("Status Line: "+response.getStatusLine());
        System.out.println("Response Body : "+response.getBody().asString());
        System.out.println("Header : "+response.getHeader("content-type"));
        System.out.println("Response Time : "+response.getTime());
        Assert.assertEquals(response.getStatusCode(),200);
    }
    
    @Test
    public void testGet_1() {
        Response response = RestAssured.get("https://70ssu4a992.execute-api.us-west-2.amazonaws.com/items");
        
        System.out.println(response.asString());
        System.out.println("Status code : "+response.getStatusCode());
        System.out.println("Status Line: "+response.getStatusLine());
        System.out.println("Response Body : "+response.getBody().asString());
        System.out.println("Header : "+response.getHeader("content-type"));
        System.out.println("Response Time : "+response.getTime());
        Assert.assertEquals(response.getStatusCode(),200);
    }
}

