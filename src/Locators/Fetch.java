package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch 

	{
public static void main(String[] args) throws InterruptedException 
	
	{
		
    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		Thread.sleep(10000);
		 WebElement user = driver.findElement(By.xpath("//b[contains( ., 'admin')]"));
      WebElement pass = driver.findElement(By.xpath("//b[contains( ., 'manager')]"));
      
		driver.findElement(By.id("username")).sendKeys(user.getText());
		driver.findElement(By.name("pwd")).sendKeys(pass.getText(),Keys.ENTER);
	}
}
