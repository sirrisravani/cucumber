package Stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\sravani sandhya\\eclipse-workspace\\Cucumber\\Cucumber\\Features\\Login.feature",
		glue= {"Stepdefinition"},
		
		dryRun = false,
		        monochrome = true,//display the console output in a proper readable format
		        strict=true//it will check any step is not defined in step definition file
		       // format = {"pretty", "html:test-out"}//check mapping betwwen feature and def file
		)


		
public class Runner {

}
