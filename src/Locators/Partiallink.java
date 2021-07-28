package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partiallink 
{
public static void main(String[] args) throws InterruptedException 
	
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(10000);
driver.findElement(By.partialLinkText("Log")).click();
	
}
}