package tests;

import org.testng.annotations.Test;

import pages.AddReviewPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductDetailsPage;

public class AddReviewTest extends TestBase {
	HomePage homePage;
	LoginPage log;
	AddReviewPage review;
	ProductDetailsPage details;

	@Test
	public void userLogin() {
		homePage = new HomePage(driver);
		homePage.navigateToLoginPage();
		log = new LoginPage(driver);
		log.setLogFunction(jsonData.getTestData("email"), jsonData.getTestData("password"));
	}
	
	@Test(priority = 1)
	public void userSearchForProduct() {
		homePage = new HomePage(driver);
		homePage.navigateToProduct("mac");
	}
	
	@Test(priority = 2)
	public void userCanAddRview() {
		details = new ProductDetailsPage(driver);
		details.navigaetToAddReview();
		review = new AddReviewPage(driver);
		review.addReview("mac products","this product is a very good product but it is too expensive");
		driver.assertThat().element(review.getAssertionLocator()).text().contains("Product review is successfully added.").perform();
	}
}
