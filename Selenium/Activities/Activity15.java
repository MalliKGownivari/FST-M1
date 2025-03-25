package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity15 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		
		System.out.println("Browsre is open");
		System.out.println("The Title of the page : "+ driver.getTitle());
		WebElement nameField = driver.findElement(By.xpath("//input[contains(@id,'full-name-')]"));
		WebElement emailField = driver.findElement(By.xpath("//input[contains(@id,'-email')]"));
		WebElement dataField = driver.findElement(By.xpath("//label[contains(text(),'event?')]/folowing-sibling::input[@type='date']"));
		WebElement detailsField = driver.findElement(By.xpath("//textarea[contains(@id,'-additional-details-')]"));
		
		
		nameField.sendKeys("malli");
		emailField.sendKeys("gownivarimalli@gmail.com");
		dataField.sendKeys("2025-03-15");
		detailsField.sendKeys("End of course party");
		
		driver.findElement(By.xpath("//buttonn[text()='Submit']")).click();
		
		String message = driver.findElement(By.id("action-confirmation")).getText();
		System.out.println("Success message : " + message);
		driver.quit();
	}
}
