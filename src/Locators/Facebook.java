package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook
{
	public static void main(String[] args) 
	
	{
		
    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://facebook.com");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
	
		email.sendKeys("kambleprachi95@gmail.com");
		 WebElement passward = driver.findElement(By.id("pass"));
		 passward.sendKeys("1234");
	    
		 WebElement login = driver.findElement(By.name("login"));
		 
	
		 login.click();
}
}