package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class HomePage {

	private SHAFT.GUI.WebDriver driver;

	public HomePage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;

	}

	private By SignUpButton = By.linkText("Register");
	private By logOutBtn = By.linkText("Log out");
	private By loginBtn = By.linkText("Log in");
	private By searchBox = By.id("small-searchterms");
	private By product = By.id("ui-id-2");

	public SignUpPage navigateToRegisterPage() {
		driver.element().click(SignUpButton);
		return new SignUpPage(driver);

	}

	public void setLogOut() {
		driver.element().click(logOutBtn);
	}

	public void navigateToProduct(String productName) {
		driver.element().type(searchBox, productName);
		driver.element().click(product);
	}

	public LoginPage navigateToLoginPage() {
		driver.element().click(loginBtn);
		return new LoginPage(driver);
	}

}
