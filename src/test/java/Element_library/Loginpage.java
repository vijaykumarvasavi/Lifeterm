package Element_library;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Genaric_Library.BaseTest;
import Genaric_Library.Datafilehandiling;
import Pomrepogitry.Logintopage;

public class Loginpage extends BaseTest{
	
	
	@Test
	public void loginpage () throws Exception {		

		
		Logintopage login = new Logintopage(driver);
		Datafilehandiling data = new Datafilehandiling();
		
		String MOBILENUMBER = data.getdatafile("Mobilenumber");
		String OTP = data.getdatafile("Otp");
		
		System.out.println(MOBILENUMBER);
		System.out.println(OTP);
		
		
		login.getCreateaccount().click();
		Thread.sleep(3000);
		
		login.getMobilenmber().sendKeys(MOBILENUMBER);
		Thread.sleep(3000);
		
		login.getContinuBt().click();
		Thread.sleep(3000);
		
		login.getOTPfield().sendKeys(OTP);
		Thread.sleep(3000);
		
		login.getVerfiyOTP().click();
		Thread.sleep(3000);
		
		
		
		
		
		
	
		
	    
		
		
		
		
		
		
	
	
	
	
	
	
}

}
