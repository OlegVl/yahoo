package pageobjects;

import static setup.SeleniumDriver.getDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class YahooHomePage extends YahooMainPage<YahooHomePage> {

    /**
     * Page object representing yahoo home page.
     */

    private static final String NAVIGATION_BLOCK = "//*[@class='navlist']/li/a";

    @Override
    public String getPageUrl() {
	return "";
    }

    public YahooLoginPage goToLoginPage() {
	return new YahooLoginPage().openPage(YahooLoginPage.class);
    }

    public YahooHomePage open() {
	return new YahooHomePage().openPage(YahooHomePage.class);
    }

    public void clickOnNavigationLinks() {
	for (int i = 0; true; i++) {
	    List<WebElement> allElements = getDriver().findElements(By.xpath(NAVIGATION_BLOCK));
	    if (i >= allElements.size())
		break;
	    allElements.get(i).click();
	    getDriver().navigate().back();
	}
    }

}
