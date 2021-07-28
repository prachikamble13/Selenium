import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class naukari 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Software/ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

				driver.navigate().to("http://www.naukri.com");
				String parent = driver.getWindowHandle();
				System.out.println("Helloo    "+parent);
		   Set<String> wins = driver.getWindowHandles();
		   //wins.remove(parent);
		   for(String win1 : wins)
		   {
			   System.out.println(win1);
			   driver.switchTo().window(win1);
			   driver.close();
		   
			   
		   }
		
				  
				 
		
	}

}
