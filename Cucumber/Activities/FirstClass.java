package stepdefinitions;

import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstClass extends BaseClass {

	@Given("the user is on TS home page")
	public void openPage() {
		driver.get("https://training-support.net");
		assertEquals(driver.getTitle(), "Training Support");

	}

	@When("the user clicks on the About us link")
	public void clickLink() {
		driver.findElement(By.linkText("About Us")).click();
	}

	@Then("the user is redirected to About us page")
	public void redirectToAbout() {
		assertEquals(driver.getTitle(), "About Training Support");
	}
}
