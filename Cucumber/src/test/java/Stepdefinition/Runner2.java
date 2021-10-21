package Stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\sravani sandhya\\eclipse-workspace\\Cucumber\\Cucumber\\Features\\Login2.feature",
		glue= {"Login2"}
		)
		
public class Runner2 {

}
