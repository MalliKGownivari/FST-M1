package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.poi.ss.formula.functions.Today;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity7 {
	
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
		public void addQualification()
		{
			
			WebElement qualification = driver.findElement(By.xpath("//*[@id=\"sidenav\"]/li[9]/a"));
			qualification.click();
			
			WebElement addWorkExp = driver.findElement(By.id("addWorkExperience"));
			addWorkExp.click();
			
			
			WebElement company = driver.findElement(By.id("experience_employer"));
			company.sendKeys("IBM");
			
			WebElement jobTitle = driver.findElement(By.id("experience_jobtitle"));
			jobTitle.sendKeys("Tester");
			
			
			
			
			WebElement fromDate = driver.findElement(By.id("experience_from_date"));
			fromDate.clear();
			fromDate.click();
			
			WebElement from_month = driver.findElement(By.xpath("//*[@id=\"frmWorkExperience\"]/fieldset/ol/li[3]/img"));
			Select from_monthCombo = new Select(from_month);
			from_monthCombo.selectByVisibleText("Mar");

			WebElement from_year = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
			Select from_yearCombo = new Select(from_year);
			from_yearCombo.selectByVisibleText("2015");

		 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a")).click();
		
		
		
		
		WebElement toDate = driver.findElement(By.id("experience_from_date"));
		toDate.clear();
		toDate.click();
		
		WebElement to_month = driver.findElement(By.xpath("//*[@id=\"frmWorkExperience\"]/fieldset/ol/li[3]/img"));
		Select to_monthCombo = new Select(to_month);
		to_monthCombo.selectByVisibleText("Mar");

		WebElement to_year = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
		Select to_yearCombo = new Select(to_year);
		to_yearCombo.selectByVisibleText("2020");

	 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a")).click();
	

	 
	 WebElement addComment = driver.findElement(By.id("experience_comments"));
	 addComment.sendKeys("added the experience");
	 
	 
	 WebElement saveBtn = driver.findElement(By.id("btnWorkExpSave"));
	 saveBtn.click();

}
		
		
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}



