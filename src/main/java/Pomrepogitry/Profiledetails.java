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
	
	@FindBy(xpath = "//input[@placeholder='Enter Date']")
	WebElement Calender;
	
	@FindBy (xpath = "//label[@id='Radio-false']")
	WebElement smokeRd;
	
	@FindBy(xpath = "//div[@name='maxIncome']")
	WebElement annualincome;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	WebElement Next1;
	
	@FindBy(xpath ="//div[@name='coverAmount']")
	WebElement coveredamount;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	WebElement next2;
	
	@FindBy(xpath ="//input[@name='customerName']")
	WebElement customername;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	WebElement next3;
	
	@FindBy(xpath = "//button[@data-auto='close-tour-popup']")
	WebElement okgotBT;
	
	@FindBy(xpath = "//button[@class='btn resetBtn green share-pdf-guide-confirm-btn']")
	WebElement okitBT2;
	
	@FindBy(xpath ="(//button[@class='submitBtn anim-loader'])[1]")
	WebElement viewdetails;
	
	@FindBy(xpath ="//button[@id='proceed-btn']")
	WebElement BuynoeBt;
	
	
	
	

}
