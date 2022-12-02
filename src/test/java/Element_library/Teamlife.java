package Element_library;

import org.testng.annotations.Test;

import Genaric_Library.BaseTest;
import Genaric_Library.Datafilehandiling;
import Pomrepogitry.Logintopage;
import Pomrepogitry.TeramLife;
import Pomrepogitry.sell;

public class Teamlife extends BaseTest {

	@Test
	public void loginpage() throws Exception {

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

	@Test
	public void selllogin() throws Exception {

		sell se = new sell(driver);

		se.getSellBt().click();
		Thread.sleep(3000);
	}

	@Test
	public void Termlife() throws Exception {

		TeramLife life = new TeramLife(driver);

		life.getTermLifeCreate().click();
		Thread.sleep(3000);

		life.getTermlifeinsurenceBt().click();
		Thread.sleep(30000);

	}

}
