package Pomrepogitry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sell {
	
WebDriver driver;
	
	public sell(WebDriver driver)
	{	
	PageFactory.initElements(driver, this);
	}	
	
	
	public WebDriver getDriver() {
		return driver;
	}


	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement getSellBt() {
		return sellBt;
	}


	public void setSellBt(WebElement sellBt) {
		this.sellBt = sellBt;
	}


	@FindBy(xpath="//li[@class='sellButtonList']")
	WebElement sellBt;
	
	

}
