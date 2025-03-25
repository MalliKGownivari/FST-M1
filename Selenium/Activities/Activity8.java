package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		Actions builder = new Actions(driver);
		driver.get("https://training-support.net/webelements/mouse-events");
		
		System.out.println("Browsre is open");
		System.out.println("The Title of the page : "+ driver.getTitle());
		
		WebElement cargoLock= driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
		WebElement cargoTom1= driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
		WebElement srcButton= driver.findElement(By.xpath("//h1[text()='src']"));
		WebElement targetButton= driver.findElement(By.xpath("//h1[text()='target']"));
		
		
		builder.click(cargoLock).pause(2000).click(cargoTom1).pause(2000).build().perform();
		
		
		String actionMessage = driver.findElement(By.id("result")).getText();
		System.out.println(actionMessage);
		
		
		builder.doubleClick(srcButton).pause(2000).contextClick(targetButton).pause(2000).perform();
		
		WebElement openElement = driver.findElement(By.xpath("//span[text()='Open']"));
		builder.click(openElement).build().perform();
		
		
		actionMessage= driver.findElement(By.id("result")).getText();
		System.out.println(actionMessage);
		
		
		
		
		driver.quit();
		
		
	}
	
}
