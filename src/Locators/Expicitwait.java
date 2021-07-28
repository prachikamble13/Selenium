package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expicitwait
{
public static void main(String[] args) throws InterruptedException 
	
	{
		
    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		  //driver.findElement(By.id("username")).sendKeys("admin");
		 // driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		  driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager",Keys.ENTER);
		// WebElement logout = driver.findElement(By.id("logoutLink"));
		WebElement logout = driver.findElement(By.xpath("//a[@id='logoutLink']"));
     WebDriverWait ww=new   WebDriverWait(driver,10);
     ww.until(ExpectedConditions.titleContains("Enter"));
		 logout.click();
		  

}
}