package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName
{
public static void main(String[] args) throws InterruptedException 
	
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://google.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
Thread.sleep(10000);
   List<WebElement> links = driver.findElements(By.tagName("a"));
   
	for(WebElement link: links)
	{
		System.out.println(link.getText());
	}
    System.out.println(links.size());

}
}
