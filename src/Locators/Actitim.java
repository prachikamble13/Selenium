package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitim 
{
public static void main(String[] args) 
	
	{
		
    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("username"));
	username.sendKeys("admin");
		 WebElement passward = driver.findElement(By.name("pwd"));
		 passward.sendKeys("manager");
	    
	
	}
}
