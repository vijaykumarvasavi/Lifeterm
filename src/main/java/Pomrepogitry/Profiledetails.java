package Pomrepogitry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profiledetails {
	
WebDriver driver;
	
	public Profiledetails (WebDriver driver)
	{	
	PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath = "//label[@id='Radio-M']")
	WebElement MaleBt;
	
	@FindBy (xpath = "//label[@id='Radio-false']")
	WebElement smokeRd;
	
	

}
