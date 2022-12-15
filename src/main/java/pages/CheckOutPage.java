package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class CheckOutPage {
	private SHAFT.GUI.WebDriver driver;
	public CheckOutPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}
	
	private By services = By.id("termsofservice");
	private By checkoutBtn = By.id("checkout");
	
	public ShippingAddressPage naviagtToAddress() {
		driver.element().click(services);
		driver.element().click(checkoutBtn);
		return new ShippingAddressPage(driver);
	}

}
