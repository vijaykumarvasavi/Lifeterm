package Pomrepogitry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutdetails {
	
WebDriver driver;
	
	public Checkoutdetails (WebDriver driver)
	{	
	PageFactory.initElements(driver, this);
	}
	
	
	
	  @FindBy(xpath = "(//span[@class='ui-select-match-text pull-left'])[1]")
	  WebElement title;
	  
	  @FindBy(xpath = "//input[@id='insuredMemberLName']")
	  WebElement lastname;
	
	 @FindBy(xpath = "//input[@name='insuredMemberMobile']")
     WebElement mobilenumber;
	 
	 @FindBy(xpath = "//input[@name='insuredMemberMobile']")
	 WebElement emailid;
	 
	 @FindBy(xpath = "(//span[@class='btn btn-default form-control ui-select-toggle'])[2]")
	 WebElement MaritalStatus;
	 
	 @FindBy(xpath = "//button[@class='tm-checkout-accordion-button ng-binding']")
	 WebElement contiuneBt;
	 
	 
	 
	 
	 
	 
	 
}
