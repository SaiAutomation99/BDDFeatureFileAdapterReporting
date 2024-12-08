package StepDefinition;



import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class StepPass_Fail {
	public static Scenario scenario=null;
	@Before
	public void beforeStep(Scenario scenario) {
		this.scenario = scenario; 
		}
	@AfterStep
	public void tearDown(Scenario scenario) {
			if(scenario.isFailed()){
				//Code here
				System.out.println(scenario.getStatus());
				
			scenario.log("failed testcase");
			}else if(scenario.getStatus().toString().equalsIgnoreCase("passed")){
				//Code here
				System.out.println("pass");
			}
		
	}

}
