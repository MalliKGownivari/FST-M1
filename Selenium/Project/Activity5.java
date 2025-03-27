package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Activity5 {
	
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
	public void editMyInfo() throws InterruptedException
	{
		WebElement myInfo_Link = driver.findElement(By.id("menu_pim_viewMyDetails"));
		
		myInfo_Link.click();
		
		//Edit button xpath is not workings
		WebElement edit = driver.findElement(By.xpath("//*[@id=\"btnSave\"]"));
		edit.click();
		
		
		WebElement firstName = driver.findElement(By.id("personal_txtEmpFirstName"));
		firstName.clear();
		firstName.sendKeys("Malli");
		
		
		WebElement lastName = driver.findElement(By.id("personal_txtEmpFirstName"));
		lastName.clear();
		lastName.sendKeys("Gownivari");
		
		
		WebElement gender = driver.findElement(By.id("personal_optGender_1"));
		gender.click();
		
		
		WebElement nationality = driver.findElement(By.id("personal_cmbNation"));
		Select countries = new Select(nationality);
		countries.selectByVisibleText("American");
		
		
		WebElement saveButton = driver.findElement(By.id("btnSave"));
		saveButton.click();
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}



