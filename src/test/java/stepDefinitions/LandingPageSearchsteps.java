package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TextContextSetup;
//SIngle Responsibility Principle
//Loosely Coupled

public class LandingPageSearchsteps {
TextContextSetup tcs;
public LandingPageSearchsteps(TextContextSetup tcs) {
	this.tcs=tcs;
	
}	
	@Given("user navigates to the landing page")
	public void user_navigates_to_the_landing_page() {
		tcs.pom.getLandingPage().LandingPageNav(tcs.QA_URL);
	}
	@When("^user searches for the product (.+) in the landing page$")
	public void user_searches_for_the_product_in_the_landing_page(String vegetable) throws InterruptedException {
	LandingPage	landingPageObj=	tcs.pom.getLandingPage();
	 landingPageObj.searchBox(vegetable);
	tcs.str1= landingPageObj.findingProductName(vegetable);
//	 tcs.pom.getLandingPage().searchBox(vegetable);
//tcs.str1=	 tcs.pom.getLandingPage().findingProductName();
	  

	}
}
