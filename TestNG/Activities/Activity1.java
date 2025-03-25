package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity1 {
	
	//declare the class objects
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/");
	}
	
	@Test(priority = 1)
	public void pageTitleTest()
	{
		assertEquals(driver.getTitle(),"Training Support");
	}
	
	@Test(priority = 2)
	public void aboutLinkTest()
	{
		driver.findElement(By.linkText("About Us")).click();
		assertEquals(driver.getTitle(),"About Training Support");
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
