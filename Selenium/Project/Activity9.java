package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity9 {
	
	//declare the class objects
	WebDriver driver;
	
	
	@BeforeClass
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		
	}
	
	@Test(priority = 1)
	public void login()
	{
		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		
		userName.sendKeys("orange");
		password.sendKeys("orangepassword123");
		loginButton.click();
		
		System.out.println(driver.getTitle());
		
	}
	
	@Test(priority = 2)
	public void myInfo()
	{
		WebElement myInfo = driver.findElement(By.id("menu_pim_viewMyDetails"));
		myInfo.click();
					
	}
	
	
	@Test(priority = 3)
	public void emergencyContact()
	{
		WebElement emergency_contact = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[3]/a"));
		emergency_contact.click();
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='emgcontact_list']//tr")); 

		
		for (WebElement row : allRows) { 
		    List<WebElement> cells = row.findElements(By.tagName("td")); 

		    
		    for (WebElement cell : cells) {         

		    System.out.println(cell.getText());
		    
		}
		    
		}
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}



