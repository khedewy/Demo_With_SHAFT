package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;

public class LogTest extends TestBase {
	HomePage homePage;
	LoginPage log;
	SignUpPage sign;

	@Test()
	public void UserRgister() {
		homePage = new HomePage(driver);
		homePage.navigateToRegisterPage();
		sign = new SignUpPage(driver);
		sign.fillUserInformation(jsonData.getTestData("firstName"),jsonData.getTestData("lastName"), jsonData.getTestData("email"), jsonData.getTestData("email"),jsonData.getTestData("password"));
		sign.setUserRegister();
		driver.assertThat().element(sign.assertionLocator()).text().contains("Your registration completed").perform();
		homePage.setLogOut();
	}

	@Test(priority = 1)
	public void UserCanLogin() {
		homePage = new HomePage(driver);
		homePage.navigateToLoginPage();
		log = new LoginPage(driver);
		log.setLogFunction(jsonData.getTestData("email"),jsonData.getTestData("password"));
	}
}
