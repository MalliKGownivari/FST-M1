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

public class Activity8 {
	
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
	
	public void leaveApply()
	{
		WebElement dashboard = driver.findElement(By.id("menu_dashboard_index"));
		dashboard.click();
		
		WebElement LeaveLink = driver.findElement(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[4]/div/a/img"));
		LeaveLink.click();
		
		WebElement applyLeave = driver.findElement(By.xpath("menu_leave_applyLeave"));
		applyLeave.click();
		
		//I'm getting No leave Types with leave balances 
		
		// So Unable to do apply for leave
		
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}



