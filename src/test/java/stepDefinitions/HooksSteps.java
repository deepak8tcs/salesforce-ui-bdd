package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.Driver;
import utils.PropertyManager;

public class HooksSteps {

	public static WebDriver driver;

	@Before
	public void setUpDriver(){	
		//Driver.initialize();
		driver = Driver.getDriver();

	}	

	@After
	public void tearDownDriver(Scenario scenario) {
		System.out.println("scenario executed is: "+scenario.getName());
		System.out.println("scenario status is: "+scenario.getStatus());
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png"); //stick it in the report
		}
		//Driver.closeBrowser();
	}

}
