package stepDefinition;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Case {

	/*@When("User Navigate to LogInPage")
	public void func(){
		System.out.println("when");
	}*/
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertFalse(false);
	}

	@When("^User Navigate to LogInPage$")
	public void user_Navigate_to_LogInPage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertFalse(true);
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(true);
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertFalse(false);
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(true);
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertFalse(true);
	}
}
