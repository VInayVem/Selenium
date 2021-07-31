package API.test;

import static io.restassured.RestAssured.*;


import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class API1 {

	@Test
	public void tokenapi() {
		String response = given().
		get("http://api-elb-660872344.ap-south-1.elb.amazonaws.com/OmniFinServices/oauth/token?grant_type=client_credentials&username=user&password=password&client-id=the_client&client-secret=secret").
		then().
		statusCode(200).
		extract().response().asString();
		//System.out.println(response);
		
		JsonPath tok= new JsonPath(response);
		System.out.println(tok.getString("access_token"));
		///String access= tok.getString("access_token");

		///System.out.println(access);
		
	}
	}
	
//	//////@Test
//	public void tokenapi2() {
//		Response response= get("http://api-elb-660872344.ap-south-1.elb.amazonaws.com/OmniFinServices/oauth/token?grant_type=client_credentials&username=user&password=password&client-id=the_client&client-secret=secret");
//				System.out.println(response.getBody().asPrettyString())
//				
//	}	
// //////@Test
// 
//}
