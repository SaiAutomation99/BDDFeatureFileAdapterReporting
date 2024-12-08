package RunnerPackage;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Sai Prasanth\\eclipse-workspace\\CucumberProject\\src\\main\\java\\Feature\\Practise.feature", 
glue= {"StepDefinition"},
plugin = {"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		
		
}
		)
public class TestRunner {


}
