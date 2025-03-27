package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity6 {
	
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
	
	@Test
	public void verifyDirectoryMenu()
	{
		
		WebElement dashboard = driver.findElement(By.xpath("//*[@id=\"menu_dashboard_index\"]/b"));
		System.out.println("Dashboard is displayed : " + dashboard.isDisplayed());
		
		dashboard.click();
		
		String title = driver.getTitle();
		
		Assert.assertEquals(title, "Search Directory");
		System.out.println("Title is same as " + title);
		
		
		
	}

	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}



