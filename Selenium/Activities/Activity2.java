package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		//initialization of web browser
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/login-form/");
		
		System.out.println("Browsre is open");
		
		System.out.println("The Title of the page : "+ driver.getTitle());
		
	
		driver.findElement(By.id("username")).sendKeys("admin");
       
        driver.findElement(By.id("password")).sendKeys("password");
        
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        
        String message = driver.findElement(By.tagName("h1")).getText();
        System.out.println(message);
		
        driver.quit();
		
	}

}
