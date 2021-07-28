package Locators;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Java
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
	WebElement java = driver.findElement(By.xpath("//h2/span[contains( .,'Java')]"));
	Actions a=new Actions(driver);
	a.doubleClick(java).perform();
	
	
	
	
	}

	
	}
