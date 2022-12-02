package Genaric_Library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest {

	Datafilehandiling dt = new Datafilehandiling();
	public WebDriver driver;

	@BeforeSuite
	public void opendatabase() {
		System.out.println("Open database");
	}

	@BeforeClass
	public void lunchbrowser() throws Exception {
		System.out.println("luncher browser");

		String BROWSER = dt.getdatafile("Browser");
		System.out.println(BROWSER);

		if (BROWSER.equalsIgnoreCase("Chrome")) {
			// System.setProperty("Webdriver.chrome.driver",
			// "\\Users\\user\\eclipse-workspace\\Life\\src\\main\\resources\\Drivers\\chromedriver.exe"
			// );
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid browser");
		}

		 String URL = dt.getdatafile("url");
		 System.out.println(URL);
		driver.get(URL);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@BeforeMethod
	public void LoginApplication() throws Throwable {

		System.out.println("LoginApplication");
	}

	@AfterMethod
	public void LogoutApplication() {
		System.out.println("Logout Application");

	}

	@AfterClass
	public void closebrowser() {
		System.out.println("close browser");
		driver.quit();
	}

	@AfterSuite
	public void closedatabase() {
		System.out.println("Close database");
	}
}
