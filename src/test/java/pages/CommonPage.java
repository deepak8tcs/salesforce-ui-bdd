package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Driver;

public class CommonPage {

	public WebDriver driver;
	
	public CommonPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(id = "username")
	WebElement userName;

	@FindBy(id = "password")
	WebElement userPassword;

	@FindBy(id = "Login")
	WebElement loginBtn;
	
	@FindBy(css = "a[title='Accounts']>span")
	WebElement accountsTab;
	
	@FindBy(xpath = "//a[@title='New']/div")
	WebElement newBtn;

	public void enterUserName(String username) {
		userName.sendKeys(username);

	}

	public void enterPassword(String password) {
		userPassword.sendKeys(password);

	}

	public void clickLogin() {
		loginBtn.click();
		Driver.waitUntilVisible(accountsTab);

	}
	
	public String getPageTitle() {
		try {
			return driver.getTitle();
		} catch (Exception ex) {
			return null;
		}

	}

	public void NavigateToPage(String pageName) {
		
	switch(pageName) {
	case "createAccount":
		Driver.waitUntilVisible(accountsTab);
		accountsTab.click();	
		Driver.waitUntilClickable(newBtn);
		newBtn.click();
		break;
	case "createContact":
		Driver.waitUntilVisible(accountsTab);
		accountsTab.click();	
		Driver.waitUntilClickable(newBtn);
		newBtn.click();
		break;
	case "createOpportunity":
		Driver.waitUntilVisible(accountsTab);
		accountsTab.click();	
		Driver.waitUntilClickable(newBtn);
		newBtn.click();
		break;	
	case "createLead":
		Driver.waitUntilVisible(accountsTab);
		accountsTab.click();	
		Driver.waitUntilClickable(newBtn);
		newBtn.click();
		break;	
				
	}
		
	}

	
	

}
