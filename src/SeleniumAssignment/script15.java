package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script15
{

	public static void main(String[] args)
	{
		
		
	    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
					
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.bluestone.com/");
			
			driver.manage().window().maximize();
			


	}
	}

