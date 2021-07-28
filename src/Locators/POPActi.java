package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPActi 
{
public static void main(String[] args) 
	
	{
		
    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("username"));
	username.sendKeys("admin");
	 driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	 driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']"));
		 driver.findElement(By.xpath("//a[text()='About your actiTIME']"));
	   WebElement text = driver.findElement(By.xpath("//td[@class='aboutCopyright']"));
	   System.out.println(text.getText());
	
	}
}



