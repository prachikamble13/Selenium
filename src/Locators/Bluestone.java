package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone 
{
public static void main(String[] args) throws InterruptedException 
	
	{
		
    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/goldmine.html?gmfidv=GMS50");
		
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(.,'10+1 Monthly Plan')]")).click();
		//driver.findElement(By.xpath("")).click();

	}
}
