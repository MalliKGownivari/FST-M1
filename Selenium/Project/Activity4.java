package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity4 {
	
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
	
	public void addEmployee()
	{
		WebElement PIM = driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
		PIM.click();
		
		WebElement employeeList = driver.findElement(By.id("menu_pim_viewEmployeeList"));
		employeeList.click();
		
		WebElement addEmployee = driver.findElement(By.id("btnAdd"));
		addEmployee.click();
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Malli");
		
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Gownivari");
		
		driver.findElement(By.id("btnSave")).click();
	}
	
	
	@Test (priority = 3)
	public void verifyEmployeeDetails() throws InterruptedException {
		
		
		WebElement PIM = driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
		PIM.click();
		
		WebElement employeeList = driver.findElement(By.id("menu_pim_viewEmployeeList"));
		employeeList.click();
		
		WebElement employeName = driver.findElement(By.id("empsearch_employee_name_empName"));
		employeName.clear();
		
		Thread.sleep(10000);
		employeName.sendKeys("Malli Gownivari");
		
		Thread.sleep(10000);
		WebElement selectEmployee = driver.findElement(By.xpath("/html/body/div[4]/ul/li"));
		selectEmployee.click();
		
		
		
		WebElement employeeSelected = driver.findElement(By.xpath("empsearch_employee_name_empName"));
		String emp = employeeSelected.getText();
		
		if(emp.equals("Malli Gownivari"))
		{
			System.out.println("Employee details added successfully");
		}
		else {
			System.out.println("Employee details not added");
		}
		
	}	
		
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
