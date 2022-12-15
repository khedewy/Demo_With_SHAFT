package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductDetailsPage;

public class AddToCompareListTest extends TestBase {
	HomePage home;
	ProductDetailsPage details;

	@Test
	public void searchForProduct() {
		home = new HomePage(driver);
		home.navigateToProduct("mac");
	}

	@Test(priority = 1)
	public void addToCompareList() {
		details = new ProductDetailsPage(driver);
		details.addToComparelist();
		driver.assertThat().element(details.firstAssertionLocator()).text().contains("Apple MacBook Pro 13-inch").perform();
	}

	@Test(priority = 2)
	public void addToCompareListAgain() {
		home = new HomePage(driver);
		home.navigateToProduct("sams");
		details = new ProductDetailsPage(driver);
		details.addToComparelist();
		driver.assertThat().element(details.secondAssertionLocator()).text().contains("Samsung Series 9 NP900X4C Premium Ultrabook").perform();
	}
}
