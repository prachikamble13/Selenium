package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XFB 
{
public static void main(String[] args) throws InterruptedException 
	
	{
		
    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		 WebElement creatracc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		 creatracc.click();

}
}