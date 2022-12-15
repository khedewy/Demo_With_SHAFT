package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SendWishListPage;
import pages.SignUpPage;
import pages.WishListPage;

public class sendWishListToFriend extends TestBase {
	HomePage homePage;
	SignUpPage sign;
	ProductDetailsPage details;
	WishListPage wishListPage;
	SendWishListPage send;

	@Test
	public void userRegisterFirst() {

		homePage = new HomePage(driver);
		homePage.navigateToRegisterPage();
		sign = new SignUpPage(driver);
		sign.fillUserInformation(jsonData.getTestData("firstName"), jsonData.getTestData("lastName"),
				jsonData.getTestData("email"), jsonData.getTestData("email"), jsonData.getTestData("password"));
		sign.setUserRegister();
		driver.assertThat().element(sign.assertionLocator()).text().contains("Your registration completed").perform();
	}

	@Test(priority = 1)
	public void userAddTowProductToWishList() {
		homePage.navigateToProduct("mac");
		details = new ProductDetailsPage(driver);
		details.navigateoWwishlist();
		homePage.navigateToProduct("compu");
		details.BuildComputer();
		details.addToWishListAgain();
	}

	@Test(priority = 2)
	public void sendWishList() {
		send = new SendWishListPage(driver);
		wishListPage = new WishListPage(driver);
		wishListPage.navigateToEmailPage();
		send.sendEmail("mmadsa@gmail.com", "this my wish list send me ur feedback about my computer");
		driver.assertThat().element(send.getAssertionLocator()).text().contains("Your message has been sent.").perform();

	}

}
