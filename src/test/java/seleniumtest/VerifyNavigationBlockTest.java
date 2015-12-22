package seleniumtest;

import static setup.SeleniumDriver.getDriver;

import org.junit.AfterClass;
import org.junit.Test;

import pageobjects.YahooHomePage;

public class VerifyNavigationBlockTest {

    @Test
    public void clickOnNavigationBlockLinks() {
	YahooHomePage homePage = new YahooHomePage().open();
	homePage.clickOnNavigationLinks();
    }

    @AfterClass
    public static void tearDown() {
	getDriver().close();
    }

}
