package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
	
	public WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(name = "q")
	WebElement searchBox;

	@FindBy(name = "btnK")
	WebElement searchBtn;
	
	
	public void enterSearchText(String searchText) {
		searchBox.sendKeys(searchText);
	}
	
	public void clickSearchButton() {
		searchBtn.click();;
	}
	
	
	public void loadPage(String pageName) {
		if(pageName.equalsIgnoreCase("googleHome"))
		driver.get("https://www.google.com/");
	}


}
