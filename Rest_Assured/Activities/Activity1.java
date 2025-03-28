package activities;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class Activity1 {
	
	@Test(priority = 1)
	
	public void addNewPet()
	{
		Map<String, Object> reqBody = new HashMap<>();
		reqBody.put("id" , 77232);
		reqBody.put("name" , "Riley");
		reqBody.put("status" , "alive");
		
		// send request , get response , assert response
		
		given()
		.baseUri("https://petstore.swagger.io/v2/pet")
		.header("Content-Type" , "application/json")
		.body(reqBody)
		
		.when()
			.post()
		
		.then()
			.log().all()
			.statusCode(200)
			.body("name", equalTo("Riley"))
			.body("status", equalTo("alive"));
		
	}
	
	@Test(priority = 2)
	public void getPetInfo()
	{
		
		given()
		.baseUri("https://petstore.swagger.io/v2/pet")
		.header("Content-Type" , "application/json")
		.pathParam("petId", 77232)
		.log().all()
		
		.when()
			.get("/{petId}")
		
		.then()
			.log().all()
			.statusCode(200)
			.body("name", equalTo("Riley"))
			.body("status", equalTo("alive"));
		
	}
		
	

	@Test(priority = 3)
	public void deletePet()
	{
		
		given()
		.baseUri("https://petstore.swagger.io/v2/pet")
		.header("Content-Type" , "application/json")
		.pathParam("petId", 77232)
		.log().all()
		
		.when()
			.delete("/{petId}")
		
		.then()
			.log().all()
			.statusCode(200)
			.body("message", equalTo("77232"));
	}
}

