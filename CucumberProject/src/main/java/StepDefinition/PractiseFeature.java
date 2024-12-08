package StepDefinition;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PractiseFeature {
	
	@Given("User is in the login page")
	public void user_is_in_the_login_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("System1");
	

	}

	@Then("Open the browser")
	public void open_the_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("System2");
	}

	@Then("close the browser")
	public void close_the_browser() throws Throwable {
		//scenario.log("text added");
		String s="{  \r\n"
				+ "    \"employee\": {  \r\n"
				+ "        \"name\":       \"sonoo\",   \r\n"
				+ "        \"salary\":      56000,   \r\n"
				+ "        \"married\":    true  \r\n"
				+ "    }  \r\n"
				+ "}  ";
		try {
			StepPass_Fail.scenario.log(s);
			StepPass_Fail.scenario.log("this is used to sent the logs");
			StepPass_Fail.scenario.write("1123344 added");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(10/0);
		System.out.println("System3");
	

	}

}
