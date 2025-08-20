package stepDefinitions;

import org.openqa.selenium.WebDriver;

import pageObjects.LandingPage;
import pageObjects.OffersPage;
public class PageObjectManager {
//Factory Design pattern
	public WebDriver driver;
	public LandingPage lpObj;
	public OffersPage opObj;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LandingPage getLandingPage() {
		lpObj = new LandingPage(driver);
		return lpObj;

	}

	public OffersPage getOffersPage() {
		opObj = new OffersPage(driver);
		return opObj;
	}

}
