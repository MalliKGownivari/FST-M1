package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://training-support.net/webelements/tables");
	
		 System.out.println("Browsre is open");
	
		 System.out.println("The Title of the page : "+ driver.getTitle());
		 
		// Number of columns 
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class,'table-auto')]/thead/tr/th"));
		System.out.println("Number of columns : "+ cols.size());
					
		// Number of Rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'table-auto')]/thead/tr"));
		System.out.println("Number of rows : "+ rows.size());
		
		// 5th row book name
		WebElement cellValue = driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr[5]/td[2]"));
		System.out.println("Book name before starting: " + cellValue.getText());
		
		
		// sort the table
		
		driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/thead/tr/th[5]")).click();
		
		
		System.out.println("Book name after soring : " + cellValue.getText());
		driver.quit();
	}
		 
}
