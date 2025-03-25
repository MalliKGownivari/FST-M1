package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity18 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/alerts");
		
		System.out.println("Browsre is open");
		System.out.println("The Title of the page : "+ driver.getTitle());
		
		driver.findElement(By.id("simple")).click();
		Alert simpleAlert = driver.switchTo().alert();
		
		
		System.out.println(simpleAlert.getText());
		
		simpleAlert.accept();
		
		System.out.println("message : "+ driver.findElement(By.id("result")).getText());
		
}
}
