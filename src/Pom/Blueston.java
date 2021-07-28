package Pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blueston 
{
	@FindBy(name="search_query")
	private WebElement SearchBox;
	@FindBy(xpath ="//img[@alt='The Felicita Top Open Ring']")
	private WebElement Ring;
	@FindBy(id ="buy-now")
	private WebElement buyNow;
	@FindBy(xpath="//div[@class='formErrorContent']")
	
	private WebElement error;
	public Blueston(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
    public void sendText(String text)
    {
    	SearchBox.sendKeys(text,Keys.ENTER);
    }
    
    public void RingClick()
    {
    	Ring.click();
    	
    }
    public void buyNowClick()
    {
    	buyNow.click();
    }
    public String getErrorMsg()
    {
    	return error.getText();
    }
   
    
}
