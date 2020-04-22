package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import utils.Driver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features"
				,glue = { "stepDefinitions" }
				,format = { "pretty", "html:test-output" }
				,monochrome=true
				,tags= {"@smoke1"}
				,dryRun=false
)

public class TestRunner {
	
	@BeforeClass
	public static void setUpDriver() {	
		Driver.initialize();

	}	
	
	@AfterClass
	public static void tearDownDriver() {
		Driver.closeBrowser();
	}

}
