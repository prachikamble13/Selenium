package SeleniumAssignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Software/ChromeDriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.gmail.com");
		
	}

}
