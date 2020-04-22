package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CommonPage;
import pages.SearchPage;
import utils.Driver;
import utils.PropertyManager;

public class CommonSteps {

	CommonPage commonPage;
	public static WebDriver driver;
	public static PropertyManager properties =PropertyManager.getInstance();

	public CommonSteps(){
		driver = Driver.getDriver();
		commonPage = PageFactory.initElements(driver, CommonPage.class);
	}

	
	@Given("^\"(.*)\" logs into the salesforce application$")
	public void log_into_application(String user) {
		Driver.loadApplication();
		commonPage.enterUserName(properties.getUsername(user));
		commonPage.enterPassword(properties.getPassword(user));
		commonPage.clickLogin();
		Assert.assertTrue(commonPage.getPageTitle().contains("Home"));
		
	}
	
	@Given("^user navigates to \"(.*)\" page$")
	public void navaigate_to_page(String pageName) {

		commonPage.NavigateToPage(pageName);

		Assert.assertTrue(commonPage.getPageTitle().contains("Home"));
		
	}
	
	


}
