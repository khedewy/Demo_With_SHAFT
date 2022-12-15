package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.SignUpPage;

public class RegisterTest extends TestBase {
	HomePage homePage;
	SignUpPage sign;

	@Test
	public void Register() {
		homePage = new HomePage(driver);
		homePage.navigateToRegisterPage();
		sign = new SignUpPage(driver);
		sign.fillUserInformation(jsonData.getTestData("firstName"),jsonData.getTestData("lastName"), jsonData.getTestData("email"), jsonData.getTestData("email"),jsonData.getTestData("password"));
		sign.setUserRegister();
		driver.assertThat().element(sign.assertionLocator()).text().contains("Your registration completed").perform();
		homePage.setLogOut();
	}
}
