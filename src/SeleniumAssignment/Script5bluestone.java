package SeleniumAssignment;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script5bluestone 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		  WebElement ring = driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li/a[@title='Rings']"));
		  Actions a=new Actions(driver);
		  a.moveToElement(ring).perform();
		  driver.findElement(By.xpath(""));
	}
	

}
