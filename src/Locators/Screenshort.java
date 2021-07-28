package Locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshort
{
	public static void main(String[] args) throws InterruptedException, IOException 
	
	{
		
    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		driver.manage().window().maximize();
		Thread.sleep(100000);
	TakesScreenshot ts=(TakesScreenshot )driver;

      File ss = ts.getScreenshotAs(OutputType.FILE);
       File ssSave = new File("./Screenshort/facebook.png");
       Files.copy(ss,ssSave);
	}
       public static void takepic(WebDriver driver,String name) throws InterruptedException, IOException 
   	
   	{
   		
       TakesScreenshot ts=(TakesScreenshot )driver;

         File ss = ts.getScreenshotAs(OutputType.FILE);
          File ssSave = new File("./Screenshort"+name+".png");
          Files.copy(ss,ssSave);

}
}


