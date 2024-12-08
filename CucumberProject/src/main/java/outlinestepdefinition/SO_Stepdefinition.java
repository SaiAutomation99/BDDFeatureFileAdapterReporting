package outlinestepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SO_Stepdefinition {
	
public  String filename=null;

	@Given("User is in {string} the login page")
	public void user_is_in_the_login_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		this.filename=string;
	   System.out.println(string);
	}
	@Then("Open the browser")
	public void open_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		   System.out.println(filename);

	}
	@Then("close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		   System.out.println(filename);
	}




}
