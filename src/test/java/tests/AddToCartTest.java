package tests;

import org.testng.annotations.Test;

import pages.AddToCartPage;
import pages.HomePage;
import pages.ProductDetailsPage;

public class AddToCartTest extends TestBase {
	HomePage home;
	ProductDetailsPage details;
	AddToCartPage add;

	@Test
	public void userSearchProduct() {
		home = new HomePage(driver);
		home.navigateToProduct("mac");
	}

	@Test(priority = 1)
	public void userCanAddToCart() {
		details = new ProductDetailsPage(driver);
		add = new AddToCartPage(driver);
		details.userCanAddToCart();
		driver.assertThat().element(add.getAssertionLocator()).text().contains("Apple MacBook Pro 13-inch").perform();
	}

	@Test(priority = 2)
	public void userSearchAgain() {
		home = new HomePage(driver);
		home.navigateToProduct("samsung");
	}

	@Test(priority = 3)
	public void userCanAddToCartAgain() {
		details = new ProductDetailsPage(driver);
		add = new AddToCartPage(driver);
		details.addToCartAgain();
		driver.assertThat().element(add.getAssertionTowLocator()).text().contains("Samsung Series 9 NP900X4C Premium Ultrabook").perform();

	}

}
