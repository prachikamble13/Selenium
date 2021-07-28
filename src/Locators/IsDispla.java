package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDispla
{
public static void main(String[] args) throws InterruptedException 
	
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://google.com");
	WebElement search = driver.findElement(By.name("q"));
	System.out.println(search.isDisplayed());
	System.out.println("is enable: "+search.isEnabled());
	search.sendKeys("java");
	Thread.sleep(20000);
	
	List<WebElement> suggs = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	for(WebElement sugg :suggs)
	{
		System.out.println(sugg.getText());
	}
	suggs.get(2).click();

}
}


