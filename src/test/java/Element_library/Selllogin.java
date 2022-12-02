package Element_library;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Genaric_Library.BaseTest;
import Pomrepogitry.Logintopage;
import Pomrepogitry.sell;

public class Selllogin extends BaseTest {
	
	
	@Test
	public void selllogin() throws Exception {
		
		
		sell se = new sell(driver);
		
		se.getSellBt().click();
		Thread.sleep(3000);
		
		
	}

}
