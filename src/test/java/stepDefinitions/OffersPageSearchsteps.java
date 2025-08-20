package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.OffersPage;
import utils.TextContextSetup;

public class OffersPageSearchsteps {
	TextContextSetup tc;
public	OffersPageSearchsteps(TextContextSetup tc)
{
	this.tc=tc;
}

	@When("^user searches the product (.+) in the offers page$")
	public void user_searches_the_product_in_the_offers_page(String vegetable) {		
				OffersPage p=tc.pom.getOffersPage();
				p.offerspage();
				tc.gu.switchingWindows();
				p.searchingField(vegetable);
				tc.str2=	p.productName();
	
				
	}
	@Then("validates if same product is displayed")
	public void validates_if_same_product_is_displayed() 
	{
Assert.assertEquals(tc.str1,tc.str2);
	}
}
