package Locators;
	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
	public class Rodoubleclicj 
	{


	public static void main(String[] args) throws AWTException, InterruptedException
		
		{
			
	    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
					
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
			Thread.sleep(20000);
			WebElement java = driver.findElement(By.xpath("//h2/span[contains( .,'Java')]"));
			Actions a=new Actions(driver);
			a.doubleClick(java).perform();

			Thread.sleep(20000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_T);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyPress(KeyEvent.VK_C);
			r.keyPress(KeyEvent.VK_T);
			r.keyPress(KeyEvent.VK_V);
		


	}
	}


