package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait 
{
public static void main(String[] args) throws InterruptedException 
	
	{
		
    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(10000);
		 WebElement close = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		 close.click();
		  driver.findElement(By.xpath("//a[contains( ., 'Stores')]")).click();	
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//h3[contains(., 'Hadapsar, Pune')]")).click();
			


}}


