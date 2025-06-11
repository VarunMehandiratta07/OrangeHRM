package Intern.Orange;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPageTest;

public class Login extends Base {

	@Test
	public void loginWithValidCredentials() {

		LoginPageTest loginPage = new LoginPageTest(driver);
		loginPage.writeUserName(prop.getProperty("USER_NAME"));
		loginPage.writePassword(prop.getProperty("PASSWORD"));
		loginPage.clickOnLoginButton();

		Assert.assertTrue(loginPage.dashBoard(), "Dashboard is not visible");
	}

	@Test
	public void loginWithInvalidCredentials() {

		LoginPageTest loginPage = new LoginPageTest(driver);
		loginPage.writeUserName(prop.getProperty("USER_NAME"));
		loginPage.writePassword(prop.getProperty("INCORRECT_PASSWORD"));
		loginPage.clickOnLoginButton();

		Assert.assertTrue(loginPage.invalidCredentials(), "Invalid credentials alert is not visible");
	}

	@Test
	public void logoutAfterSuccessfullyLogin() {

		LoginPageTest loginPage = new LoginPageTest(driver);
		loginPage.writeUserName(prop.getProperty("USER_NAME"));
		loginPage.writePassword(prop.getProperty("PASSWORD"));
		loginPage.clickOnLoginButton();
		loginPage.clickOnDropDown();
		loginPage.clickOnLogOutOption();

		Assert.assertTrue(loginPage.homePageVisible(), "HomePage is not visible");
	}
}
