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
		driver.get("http://alchemy.hguy.co/orangehrm");
		System.out.println(driver.getTitle());
	}
	
	@Test(priority = 1)
	public void pageTitleTest()
	{
		assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
