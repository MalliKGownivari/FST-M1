package activities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Activity2 {
	
	@Test(priority = 1)
	
	public void addNewUser() throws IOException
	{
		FileInputStream inputJson = new FileInputStream("src/test/java/activities/userinfo.json");
		given()
		.baseUri("https://petstore.swagger.io/v2/user")
		.header("Content-Type" , "application/json")
		.body(inputJson)
		
		
		.when()
			.post()
		
		.then()
			.body("code", equalTo(200))
			.body("message", equalTo("9901"));
			inputJson.close();
	}
	
	@Test(priority = 2)
	public void getUserInfo()
	{
		File outputJson = new File("src/test/java/activities/userGETResponse.json");
		
		Response response = given()
		.baseUri("https://petstore.swagger.io/v2/user")
		.header("Content-Type" , "application/json")
		.pathParam("username", "justinc")
		
		.when()
			.get("/{username}");
				
			String restBody = response.getBody().asPrettyString();
		
		try {
			outputJson.createNewFile();
			
			
			FileWriter writer = new FileWriter(outputJson.getPath());
			writer.write(restBody);
			writer.close();
			
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		response.then().body("id",equalTo(2293));
		response.then().body("username",equalTo("justinc"));
		response.then().body("firstName",equalTo("justinc"));
		response.then().body("lastName",equalTo("justinc"));
		response.then().body("email",equalTo("justinc"));
		response.then().body("password",equalTo("justinc"));
		response.then().body("phone",equalTo("justinc"));
		
	}
		

	@Test(priority = 3)
	public void deleteUser()
	{
		
		given()
		.baseUri("https://petstore.swagger.io/v2/user")
		.header("Content-Type" , "application/json")
		.pathParam("username","justinc")
		
		.when()
			.delete("/{username}")
		
		.then()
			.body("code", equalTo(200))
			.body("message",equalTo("justinc"));
	}
}

