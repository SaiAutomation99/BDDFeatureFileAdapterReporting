package outlinestepdefinition;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Sai Prasanth\\eclipse-workspace\\CucumberProject\\src\\main\\java\\Feature\\ScenarioOutline.feature", 
glue= {"outlinestepdefinition"},
plugin = {"json:target/cucumber11.json",
		"html:target/cucumber11.html"},
dryRun = false,
monochrome = true)


public class TestRunnerSO {

}
