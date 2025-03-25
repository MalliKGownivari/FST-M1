package examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Test {

	public static void main(String[] args) {
		//initialization of web browser
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/");
		
		System.out.println("Browsre is open");
		driver.quit();
		
	}

}
