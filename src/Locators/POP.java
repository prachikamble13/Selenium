package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POP
{
	public static void main(String[] args) 
	{
		
	
	
	 System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
	
	
}
}