package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JustDil
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	
	
	 System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	 ChromeOptions co=new ChromeOptions();
	 co.addArguments("---disable-notification");
		Thread.sleep(10000);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.justdial.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	
	
}
}


