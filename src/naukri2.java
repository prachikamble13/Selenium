
//wrong
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.chrome.ChromeDriver;

public class naukri2 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Software/ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

				driver.navigate().to("http://www.naukri.com");
				  Set<String> wins = driver.getWindowHandles();
		  List<String> lst = new ArrayList<String>(wins);
				  
				  for(int i = lst.size()-1;i>=0;i--)
				   {
				  String win=lst.get(i);
					  driver.switchTo().window(win);
					   
				   }
				
	}

}
