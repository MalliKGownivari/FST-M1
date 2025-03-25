package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {
	
	public static void main(String[] args) {
		 
			 WebDriver driver = new FirefoxDriver();
			
			driver.get("https://training-support.net/webelements/tables");
			
			System.out.println("Browsre is open");
			
			System.out.println("The Title of the page : "+ driver.getTitle());

			// Number of columns 
			List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
			System.out.println("Number of columns : "+ cols.size());
			
			// Number of Rows
			List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
			System.out.println("Number of rows : "+ rows.size());
			
			
			System.out.println(driver.findElement(By.xpath("//table/tbody/tr[3]")).getText());
			
			List<WebElement> thirdrow = driver.findElements(By.xpath("//table/tbody/tr[3]"));
			for(WebElement cell:thirdrow)
			{
				System.out.println(cell.getText());
			}
			
			System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText());
			driver.quit();
	}

}
