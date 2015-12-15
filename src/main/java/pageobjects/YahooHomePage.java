package pageobjects;

public class YahooHomePage extends YahooMainPage<YahooHomePage> {

	/**
	 * Page object representing yahoo home page.
	 */

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

}
