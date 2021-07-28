package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class New 
{


public static void main(String[] args) throws InterruptedException 
	
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://facebook.com");
	driver.manage().window().maximize();
	WebElement create = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
     create.click();
     Thread.sleep(20000);
    WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
    Select s=new Select(day);
    s.selectByVisibleText("13");
    WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
    Select s1=new Select(month);
    s1.selectByValue("11");
    
   
    

}
}