package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.SearchPage;
import utils.Driver;

@SuppressWarnings("deprecation")
public class SearchSteps {

	SearchPage searchPage;
	public static WebDriver driver;

	public SearchSteps(){
		driver = Driver.getDriver();
		searchPage = PageFactory.initElements(driver, SearchPage.class);
	}


	@Given("^user is on google home page$")
	public void user_is_on_google_home_page(){
		searchPage.loadPage("googleHome");
	}

	@When("^user enters search text$")
	public void user_enters_search_text() {
		searchPage.enterSearchText("India");
		searchPage.clickSearchButton();
	}

	@Then("^search result should be displayed correctly$")
	public void search_result_should_be_displayed_correctly() throws InterruptedException  {
		Thread.sleep(3000);
		Assert.assertTrue(driver.getTitle().contains("Google"));
	}

	@Given("^\"([^\"]*)\" is on google home page$")
	public void is_on_google_home_page(String user) {
		System.out.println(user);
		searchPage.loadPage("googleHome");

	}

	@When("^user enters search text \"([^\"]*)\"$")
	public void user_enters_search_text(String searchText) {	
		searchPage.enterSearchText(searchText);
		Assert.assertEquals(true, false);
	}
}
