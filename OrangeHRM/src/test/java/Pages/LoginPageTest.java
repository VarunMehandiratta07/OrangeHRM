package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTest {

	WebDriver driver;

	public LoginPageTest(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	WebElement userNameField;

	@FindBy(name = "password")
	WebElement passwordField;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;

	@FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
	WebElement homePage;

	@FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']")
	WebElement dashboardLocator;

	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	WebElement invalidCredentialsLocator;

	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
	WebElement dropDownMenu;

	@FindBy(xpath = "//a[@href='/web/index.php/auth/logout']")
	WebElement logOutOption;

	public void writeUserName(String USER_NAME) {
		userNameField.sendKeys(USER_NAME);
	}

	public void writePassword(String PASSWORD) {
		passwordField.sendKeys(PASSWORD);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public boolean homePageVisible() {
		return homePage.isDisplayed();
	}

	public boolean dashBoard() {
		return dashboardLocator.isDisplayed();
	}

	public boolean invalidCredentials() {
		return invalidCredentialsLocator.isDisplayed();
	}

	public void clickOnDropDown() {
		dropDownMenu.click();
	}

	public WebDriver clickOnLogOutOption() {
		logOutOption.click();
		return driver;
	}
}
