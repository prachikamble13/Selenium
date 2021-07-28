package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatfbXpath
{

public static void main(String[] args) throws InterruptedException 
	
	{
		
    System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement creatracc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		 creatracc.click();
		 Thread.sleep(10000);
		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		name.sendKeys("prachi",Keys.ENTER);
		Thread.sleep(10000);
		 WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		 surname.sendKeys("kamble");
		Thread.sleep(10000);
		  WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("prachikamble13@gmail.com");
		
	 WebElement passward = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		 passward.sendKeys("prachi123",Keys.ENTER);


		
	
}
}

