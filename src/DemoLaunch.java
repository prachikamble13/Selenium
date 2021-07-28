import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		 //String Title=driver.getTitle();
		 //System.out.println(Title);
		 
		 String url = driver.getCurrentUrl();
		 System.out.println(url);
		 
		//Thread.sleep(2000);
		//driver.navigate().back();
		//Thread.sleep(2000);
		//driver.navigate().forward();
		//Thread.sleep(2000);
		 String pagesourse = driver.getPageSource();
		 System.out.println(pagesourse );
		
		//driver.navigate().refresh();
		//driver.close();
		driver.quit();
	}

}
