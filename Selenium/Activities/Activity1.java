package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		//initialization of web browser
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/");
		
		System.out.println("Browsre is open");
		
		System.out.println("The Title of the page : "+ driver.getTitle());
		driver.findElement(By.linkText("About Us")).click();
		driver.quit();
		
	}

}
