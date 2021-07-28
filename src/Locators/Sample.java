package Locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample
{


public static void main(String[] args) 
	
	{
		
    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		
		//driver.manage().window().maximize();
		 WebElement Frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(Frame);
	WebElement Slider = driver.findElement(By.xpath("//div[@id='slider']"));
		 Actions  a= new  Actions(driver);
	     a.dragAndDropBy(Slider, 50,0).perform();
}

}