package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script10 
{
public static void main(String[] args)
{
	
		
	    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
					
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.bluestone.com/");
			
			driver.manage().window().maximize();
			driver.findElement(By.className("lc-mmsuz6 e1dmt1bi0"));
		    driver.manage().window().maximize();
	
	
}

	
}
