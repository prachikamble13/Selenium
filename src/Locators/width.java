package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class width
{
public static void main(String[] args) throws InterruptedException 
	
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(10000);
	
	//js.executeScript("window.scrollBy(0,-500)");
	
	js.executeScript("window.scrollTo(document.body.scrollWidth,0)");
	js.executeScript("window.scrollTo(-document.body.scrollWidth,0)");
	
	}

}



