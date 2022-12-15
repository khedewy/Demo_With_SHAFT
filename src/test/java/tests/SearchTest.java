package tests;

import org.testng.annotations.Test;

import pages.HomePage;

public class SearchTest extends TestBase {
	HomePage home;

	@Test
	public void UserCanSearchProduct() {

		home = new HomePage(driver);
		home.navigateToProduct("mac");
	}
}
