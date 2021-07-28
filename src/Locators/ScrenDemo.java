package Locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrenDemo 
{	public static void takepic(WebDriver driver,String name) throws InterruptedException, IOException 
	
	{
		
    TakesScreenshot ts=(TakesScreenshot )driver;

      File ss = ts.getScreenshotAs(OutputType.FILE);
       File ssSave = new File("./Screenshort"+name+".png");
       Files.copy(ss,ssSave);

}
}





