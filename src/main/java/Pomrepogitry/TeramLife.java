package Pomrepogitry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeramLife {
	
	
WebDriver driver;
	
	public TeramLife(WebDriver driver)
	{	
	PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(xpath = "(//a[@class='verticalBox'])[6]")
	WebElement TermLifeCreate;
	
	@FindBy(xpath ="(//div[@class='sc-gzVnrw EhLrW'])[1]")
	WebElement TermlifeinsurenceBt;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTermLifeCreate() {
		return TermLifeCreate;
	}

	public WebElement getTermlifeinsurenceBt() {
		return TermlifeinsurenceBt;
	}
	
	

}
