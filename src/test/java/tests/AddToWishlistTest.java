package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductDetailsPage;

public class AddToWishlistTest extends TestBase {
	HomePage home;
	ProductDetailsPage details;

	@Test
	public void searchProduct() {
		home = new HomePage(driver);
		home.navigateToProduct("mac");
	}

	@Test(priority = 1)
	public void addToWishList() {
		details = new ProductDetailsPage(driver);
		details.navigateoWwishlist();
	}
}
