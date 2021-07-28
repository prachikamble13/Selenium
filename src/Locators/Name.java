package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name 
{
	public static void main(String[] args) 
	{
    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		
		//ChromeDriver driver =new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();
		
		  WebElement search = driver.findElement(By.name("q"));
	
	search.sendKeys("java");
	
	
		
	}

}
