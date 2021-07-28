package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticat
{
	public static void main(String[] args) throws InterruptedException 
	  {
		

	    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
					
			WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/basic_auth\r\n" + 
					"\r\n" + 
					"");
			
			driver.manage().window().maximize();
			//Thread.sleep(20000);


}
}