package TestPom;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStonTest
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://bluestone.com");
		
		driver.manage().window().maximize();
		Thread.sleep(10000);
	 
	BlueStonTest b1=new BlueStonTest();
	b1.sendText("Ring");
	b1.RingClick();
	Set<String> tab=driver.getWindowHandles();
	
	for(String tab1: tab);
	{
		//driver.switchTo().window(tab);
	}
		b1.buyNowClick();
		System.out.println(b1.getEroorMsg());
}

	private char[] getEroorMsg() {
		// TODO Auto-generated method stub
		return null;
	}

	private void buyNowClick() {
		// TODO Auto-generated method stub
		
	}

	private void sendText(String string) {
		// TODO Auto-generated method stub
		
	}

	private void RingClick() {
		// TODO Auto-generated method stub
		
	}
}