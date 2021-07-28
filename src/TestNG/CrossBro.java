package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBro 
{

		@Test
		@Parameters("browser")
		public void tc1(String browser) throws Exception
		{
		   WebDriver driver=null;
		   if(browser.equalsIgnoreCase("Chorme"))
		   {
			 System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
				
				 driver = new ChromeDriver();
		   }
		   else if(browser.equalsIgnoreCase("FireFox"))
		  
		   {	
			   System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
				
				 driver = new FirefoxDriver();
		 
			   }
		   else
		   {
			   driver=null;
		   }
			   driver.get("https://www.google.com");
		   
				driver.manage().window().maximize();
				Thread.sleep(10000);
				driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
			     Thread.sleep(20000);
			     driver.close();
		
		} 

	}



