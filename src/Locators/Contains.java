package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains 
{
	
public static void main(String[] args) throws InterruptedException 
	
	{
		
    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(10000);
		//  WebElement close = driver.findElement(By.xpath("//a[contains(@class='close-reveal-modal hide-mobile')]"));
		 // close.click();
		  driver.findElement(By.xpath("//a[contains( ., 'Stores')]")).click();	
		  Thread.sleep(20000);
			
				
			}
}