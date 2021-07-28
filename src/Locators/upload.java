package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload 
{
public static void main(String[] args) throws InterruptedException 
	
	{
		
    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 Thread.sleep(10000);
		 driver.findElement(By.id("//div[@id='file_wraper0']")).click();
		 Thread.sleep(10000);
		 

}
}