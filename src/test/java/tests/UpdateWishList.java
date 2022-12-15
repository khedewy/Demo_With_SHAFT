package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductDetailsPage;
import pages.WishListPage;

public class UpdateWishList extends TestBase {
	HomePage home;
	ProductDetailsPage details;
	WishListPage wishListPage;

	@Test
	public void searchProductAndAddtoWishlist() {
		home = new HomePage(driver);
		home.navigateToProduct("mac");
		details = new ProductDetailsPage(driver);
		details.navigateoWwishlist();
		home.navigateToProduct("compu");
		details.BuildComputer();
		details.addToWishListAgain();
	}
	@Test(priority = 1)
	public void DeleteItems () {
		wishListPage = new WishListPage(driver);
		wishListPage.deleteItem();
	}
}
