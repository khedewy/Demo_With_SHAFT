package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class AddToCartPage {

	private SHAFT.GUI.WebDriver driver;

	public AddToCartPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private By assertionMessage = By.linkText("Apple MacBook Pro 13-inch");
	private By assertionMessage2 = By.linkText("Samsung Series 9 NP900X4C Premium Ultrabook");

	public String setAssertionMessage() {
		return driver.element().getText(assertionMessage);
	}

	public By getAssertionLocator() {
		return assertionMessage;
	}

	public String setAssertyionMssage2() {
		return driver.element().getText(assertionMessage2);

	}

	public By getAssertionTowLocator() {
		return assertionMessage2;
	}

}
