package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class ShippingMethodes {
	private SHAFT.GUI.WebDriver driver;
	public ShippingMethodes(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}
	
	private By air = By.id("shippingoption_1");
	private By continueToPaymentMethode = By.cssSelector("button.button-1.shipping-method-next-step-button");
	private By methodeAssertion = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/form/div/div/div/ul/li[1]/div/div[2]/div");
	private By paymentMethode = By.id("paymentmethod_0");
	private By continueToPaymentInf = By.cssSelector("button.button-1.payment-method-next-step-button");
	private By paymentAssertion = By.cssSelector(".info > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > p:nth-child(1)");
	private By continueToConfirmOrder = By.cssSelector("button.button-1.payment-info-next-step-button");
	private By confirmOrderAssertion = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[6]/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div/strong");
	private By confirmOrderBtn = By.cssSelector("button.button-1.confirm-order-next-step-button");
	private By sentOrderAssertion = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong");
	
	
	public void clickAirOptio() {
		driver.element().click(air);
		driver.element().click(continueToPaymentMethode);
	}
	
	public void choosePayementMethode() {
		driver.element().click(paymentMethode);
		driver.element().click(continueToPaymentInf);
	}
	
	public void navigateToConfirmOrder() {
		driver.element().click(continueToConfirmOrder);
	}
	
	public void clickConfirmOrder() {
		driver.element().click(confirmOrderBtn);
	}
	
	public String methodeAssertionText() {
		return driver.element().getText(methodeAssertion);
	}
	public By getMethodeAssertionLocation() {
		return methodeAssertion;
	}
	public String getPaymentInfText() {
		return driver.element().getText(paymentAssertion);
	}
	public By getPayementLocation() {
		return paymentAssertion;
	}
	
	public String confirmAssertionText() {
		return driver.element().getText(confirmOrderAssertion);
	}
	public By getConfitmLocation() {
		return confirmOrderAssertion;
	}
	
	public String sentOrderAssertion() {
		return driver.element().getText(sentOrderAssertion);
	}
	public By getSentOrderLocation() {
		return sentOrderAssertion;
	}
}
