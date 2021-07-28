package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alrtpop
{
 

public static void main(String[] args) throws InterruptedException 
  {
	

    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		Thread.sleep(20000);
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Thread.sleep(20000);
			driver.findElement(By.xpath("//button[@id='alertButton']")).click();
			Thread.sleep(20000);
			 Alert a = driver.switchTo().alert();
				Thread.sleep(20000);
				System.out.println(a.getText());
				a.accept();
				//a.dismiss();
				//Thread.sleep(20000);
			  //WebElement errText = driver.findElement(By.id(""));
			//	System.out.println(errText.getText());
				
			

}
}

