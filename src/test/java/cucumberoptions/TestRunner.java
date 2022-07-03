package cucumberoptions;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src\\test\\java\\features",
	glue="stepdefinitions",stepNotifications=true,tags="@smokeTest and @sanityTest",monochrome=true,             
	plugin= {"pretty","html:target/cucumber.html","json:target/cucmber.json","junit:target/cukes.xml"})

public class TestRunner {
	
	
		

}
