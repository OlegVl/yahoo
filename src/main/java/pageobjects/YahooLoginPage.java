package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YahooLoginPage extends YahooMainPage<YahooLoginPage>{

	/**
	 * Page object representing yahoo login page.
	 */
	
	private static final String LOGIN = "vlasenko.oleg@yahoo.com";
	private static final String PASSWORD = "mynewpass2016";
	
	@FindBy(id = "login-username")
	WebElement loginField;

	@FindBy(id = "login-passwd")
	WebElement passwordField;

	@FindBy(id = "login-signin")
	WebElement commitButton;
	
	@Override
	public String getPageUrl() {
		return "/login";
	}
	
	public void login() {
		loginField.sendKeys(LOGIN);
		passwordField.sendKeys(PASSWORD);
		commitButton.click();

	}
}
