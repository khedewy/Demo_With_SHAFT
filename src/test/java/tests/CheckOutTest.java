package tests;

import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.AddToCartPage;
import pages.CheckOutPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductDetailsPage;
import pages.ShippingAddressPage;
import pages.ShippingMethodes;

public class CheckOutTest extends TestBase {
	HomePage homePage;
	LoginPage log;
	ProductDetailsPage details;
	AddToCartPage add;
	CheckOutPage check;
	ShippingAddressPage address;
	ShippingMethodes methodes;

	@Test
	@Severity(SeverityLevel.CRITICAL)
	public void login() {
		homePage = new HomePage(driver);
		homePage.navigateToLoginPage();
		log = new LoginPage(driver);
		log.setLogFunction(jsonData.getTestData("email"), jsonData.getTestData("password"));
	}

	@Test(priority = 1)
	public void userAddTCart() {
		homePage = new HomePage(driver);
		homePage.navigateToProduct("mac");
		details = new ProductDetailsPage(driver);
		add = new AddToCartPage(driver);
		details.userCanAddToCart();
		driver.assertThat().element(add.getAssertionLocator()).text().contains("Apple MacBook Pro 13-inch").perform();
	}

	@Test(priority = 2)
	public void userCanMakeCheckout() {
		check = new CheckOutPage(driver);
		address = new ShippingAddressPage(driver);
		methodes = new ShippingMethodes(driver);
		check.naviagtToAddress();
		address.enterUserData("mahmoud","khedewy","mahmoud1122@gmail.com","Microsoft","sohag", "Sohag/maragha", "Cairo", "1234", "09812312", "1234");
		address.navigateToShippingMethodes();
		driver.assertThat().element(address.getAssertionLocation()).text().contains("Shipping by land transport").perform();
		methodes.clickAirOptio();
		driver.assertThat().element(methodes.getMethodeAssertionLocation()).text().contains("Pay by cheque or money order").perform();
		methodes.choosePayementMethode();
		driver.assertThat().element(methodes.getPayementLocation()).text().contains("Mail Personal or Business Check, Cashier's Check or money order to:").perform();
		methodes.navigateToConfirmOrder();
		driver.assertThat().element(methodes.getConfitmLocation()).text().contains("Billing Address").perform();
		methodes.clickConfirmOrder();
		driver.assertThat().element(methodes.getSentOrderLocation()).text().contains("Your order has been successfully processed!").perform();

	}
}
