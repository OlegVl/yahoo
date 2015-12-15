package seleniumtest;

import static setup.SeleniumDriver.getDriver;
import pageobjects.YahooHomePage;
import pageobjects.YahooLoginPage;

import org.junit.AfterClass;
import org.junit.Test;

public class YahooTest {

	@Test
	public void yahooLogin() {
		YahooLoginPage loginPage = new YahooHomePage().open().goToLoginPage();
		loginPage.login();
	}
	
	@AfterClass
	public static void tearDown() {
		getDriver().close();
	}

}
