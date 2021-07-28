package Pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumHomes 
{
	@FindBy(xpath = "//input[@title='search']")
 private WebElement search;
	
	public SeleniumHomes(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sendText(String text)
	{
		search.sendKeys(text,Keys.ENTER);
	}
}
