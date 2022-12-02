package Element_library;

import org.testng.annotations.Test;

import Genaric_Library.BaseTest;
import Pomrepogitry.TeramLife;

public class Teamlife extends BaseTest {
	
	
	
	
	@Test
	public void Termlife () throws Exception {
		
		TeramLife life = new TeramLife(driver);
		
		life.getTermLifeCreate().click();
		Thread.sleep(3000);
		
		life.getTermlifeinsurenceBt().click();
		Thread.sleep(30000);
		
		
		
	}

}
