package activities;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
    	
    	//opening the browser
        driver = new FirefoxDriver();
        
       // adding web driver wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Open the page
        driver.get("https://training-support.net/webelements/login-form");
    }

    @Test(priority = 1)
    public void pageTitle()
    {
    	Assert.assertEquals(driver.getTitle(), "Selenium : Login Form");
    }
    @DataProvider(name = "Credentials")
    public static Object[][] credentials() {
        return new Object[][] { 
            { "admin1", "password1", "Invalid Credentials" },
            { "wrongAdmin", "wrongPassword", "Invalid Credentials" },
            {"wrongUser"  , "wrongPassword" , "Invalid Credentials"}
            
        };
        

    }

    @Test(dataProvider = "Credentials" , priority = 2)
    public void loginTest(String username, String password, String expectedMessage) {
        
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Submit']"));

        
        usernameField.clear();
        passwordField.clear();
        // Enter the credentials and click Log in
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

        try {
        	Thread.sleep(5000);
        }catch (InterruptedException e) {
			// TODO: handle exception
        	e.printStackTrace();
		}
        // Assert login message
        String loginMessage = driver.findElement(By.id("subheading")).getText();
        Assert.assertEquals(loginMessage, expectedMessage);
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}