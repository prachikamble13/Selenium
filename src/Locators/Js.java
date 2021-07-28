package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js 
{
public static void main(String[] args) throws InterruptedException 
	
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://google.com");
WebElement search = driver.findElement(By.name("q"));
System.out.println(search.isDisplayed());
System.out.println(search.isEnabled());
search.sendKeys("java",Keys.ENTER);
	
	Thread.sleep(10000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(10000);
	
	js.executeScript("window.scrollBy(0,-500)");
	
	
	
	}

}
