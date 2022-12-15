package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class ShippingAddressPage {
	private SHAFT.GUI.WebDriver driver;

	public ShippingAddressPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private By newAddress = By.id("billing-address-select");
	private By firstNameTxt = By.id("BillingNewAddress_FirstName");
	private By lastNameTxt = By.id("BillingNewAddress_LastName");
	private By emailTxt = By.id("BillingNewAddress_Email");
	private By companyTxt = By.id("BillingNewAddress_Company");
	private By country = By.id("BillingNewAddress_CountryId");
	private By cityTxt = By.id("BillingNewAddress_City");
	private By addressOneTxt = By.id("BillingNewAddress_Address1");
	private By addressTowTxt = By.id("BillingNewAddress_Address2");
	private By zipCodeTxt = By.id("BillingNewAddress_ZipPostalCode");
	private By phoneNumberTxt = By.id("BillingNewAddress_PhoneNumber");
	private By faxNumberTxt = By.id("BillingNewAddress_FaxNumber");
	private By continueBtn = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/div/button[4]");
	private By assertionMessage = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[1]/div/div/ul/li[1]/div[2]");

	public void enterUserData(String firstName, String lasName, String email, String company, String city, String addressOne, String addressTow, String zipCode, String phone,
			String fax) {
		
		driver.element().select(newAddress, "New Address");
		driver.element().type(firstNameTxt, firstName);
		driver.element().type(lastNameTxt,lasName );
		driver.element().type(emailTxt,email);
		driver.element().type(companyTxt, company);
		driver.element().select(country, "Egypt");
		driver.element().type(cityTxt, city);
		driver.element().type(addressOneTxt, addressOne);
		driver.element().type(addressTowTxt, addressTow);
		driver.element().type(zipCodeTxt, zipCode);
		driver.element().type(phoneNumberTxt, phone);
		driver.element().type(faxNumberTxt, fax);
	}

	public ShippingMethodes navigateToShippingMethodes() {
		driver.element().click(continueBtn);
		return new ShippingMethodes(driver);
	}
	
	public String assrtionMessageText() {
		return driver.element().getText(assertionMessage);
	}
	
	public By getAssertionLocation() {
		return assertionMessage;
	}

}
