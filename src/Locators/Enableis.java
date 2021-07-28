package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enableis 
{
public static void main(String[] args) throws InterruptedException 
	
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://google.com");
WebElement search = driver.findElement(By.name("q"));
System.out.println(search.isDisplayed());
System.out.println(search.isEnabled());
search.sendKeys("java");
	
	Thread.sleep(10000);

}
}