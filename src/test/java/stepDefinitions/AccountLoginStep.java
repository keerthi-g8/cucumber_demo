package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountLoginStep {
	@Given("The user goes to the application landing page")
	public void the_user_goes_to_the_application_landing_page() {
	 System.out.println("user is  on the landing page ");

	
	}
	@Given("The user goes to the login page")
	public void the_user_goes_to_the_login_page() {
	   
		System.out.println("The user goes to the login page");
	}
	/*@When("then user enters username and passward")
	public void then_user_enters_username_and_passward() {
	   System.out.println("then user enters username and passward");
	}*/
	@When("^then admin user enters (.+) and (.+)$")
	public void then_admin_user_enters_and(String username, String password) {
		System.out.println("user name is: "+username);
		System.out.println("password is: "+password);
	
	}
	@When("then user enters {string} and {string}")
	public void then_user_enters_and(String username, String password) {
		System.out.println("user name is: "+username);
		System.out.println("password is: "+password);
	
	}
	@Then("user accounts page is displayed")
	public void user_accounts_page_is_displayed() {
	   System.out.println("user accounts page is displayed");
	   

	   
	}
	@When("then user enters")
	public void then_user_enters(List<String> dataTable) {

	    System.out.println(dataTable.get(0));
	    System.out.println(dataTable.get(3));
	}
	@Given("The user goes to the Sign up page")
	public void the_user_goes_to_the_sign_up_page() {
	  
	}
	@Then("user accounts is created")
	public void user_accounts_is_created() {
	   
	}

}
