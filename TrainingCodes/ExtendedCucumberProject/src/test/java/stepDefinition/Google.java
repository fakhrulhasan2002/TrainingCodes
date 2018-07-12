package stepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Google {


@When("^Open google page$")
public void open_google_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Page Open");
}

@Then("^google page opens$")
public void google_page_opens() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("Page Close");
}
}
