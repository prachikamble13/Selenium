package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Super 
{
	{
		
	    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
					
			WebDriver driver = new ChromeDriver();
			driver.get("file:///E:/pcm11html/div.html");
			
			driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			  WebDriverWait ww=new   WebDriverWait(driver,10);
			ww.until(new ExpectedCondition<Boolean>() 
			  {

				@Override
				public Boolean apply(WebDriver arg0) {
				
					return driver.findElement(By.id("xyz")).isEnabled();
				}
				  
			});
		driver.findElement(By.id("xyz")).sendKeys("prachi");	  
			
	}	 
		

}
