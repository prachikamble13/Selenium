package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script14
{
	public static void main(String[] args)
	{
		
		
	    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
					
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.bluestone.com/");
			
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[@title='Jewellery']")).click();
			  WebElement goldcoin = driver.findElement(By.xpath("//section[@id='search-result-wrapper']"));
			  goldcoin.click();


	}
	}


