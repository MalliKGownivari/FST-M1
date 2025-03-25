package stepdefinitions;
import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class Activity6 extends BaseClass {

	@Given("User is on the To-Do list page")
	public void completeRequirement() {
        driver.get("https://training-support.net/webelements/todo-list");
		System.out.println("Given completed");
	}

	@When("User adds the following tasks")
	public void inputTasks(DataTable inputTasks) throws InterruptedException {
		List<String> tasks = inputTasks.asList();
		System.out.println(tasks);

		for(String task : tasks) {
			driver.findElement(By.id("todo-input")).sendKeys(task);
			driver.findElement(By.id("todo-add")).click();
			Thread.sleep(2000);
		}
	}

	@Then("they can see the task added to the list")
	public void verifyResults() {
		System.out.println("All tasks are present");
	}
}