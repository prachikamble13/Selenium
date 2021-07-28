package TestPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.SeleniumHomes;

public class TestSelenium 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev");
		
		driver.manage().window().maximize();
		Thread.sleep(10000);
		SeleniumHomes sh=new SeleniumHomes(driver);
		sh.sendText("java");
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(10000);
		sh.sendText("testng");
		
	
		
	}

}
