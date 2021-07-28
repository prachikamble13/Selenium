
package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo 
{
public static void main(String[] args) 
	
	{
		
    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html\r\n" + 
				"\r\n" + 
				"");
		
		driver.manage().window().maximize();
		WebElement right = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		 Actions  a= new  Actions(driver);
       //  a.contextClick(right).perform();
		 WebElement dele = driver.findElement(By.xpath("//button[contains(., 'Double-Click Me To See Alert')]"));
		 a.doubleClick().perform();
	}
}
