package Pomrepogitry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logintopage {
	
	
      WebDriver driver;
	
	public Logintopage(WebDriver driver)
	{	
	PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(xpath = "(//button[contains(.,'Create an account')])[last()]")
	WebElement createaccount;
	
	@FindBy(xpath ="//input[@name='mobileNumber']")
	WebElement mobilenmber;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCreateaccount() {
		return createaccount;
	}

	public WebElement getMobilenmber() {
		return mobilenmber;
	}

	public WebElement getContinuBt() {
		return ContinuBt;
	}

	public WebElement getOTPfield() {
		return OTPfield;
	}

	public WebElement getVerfiyOTP() {
		return verfiyOTP;
	}


	@FindBy(xpath= "//span[text()='Continue']")
	WebElement ContinuBt;
	
	@FindBy(xpath ="//input[@class='OTPInput']")
	WebElement OTPfield;
	
	@FindBy(xpath="//span[text()='Verify OTP']")
	WebElement verfiyOTP;
	
	
	

}
