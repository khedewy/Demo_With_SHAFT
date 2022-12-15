package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class LoginPage {
	private SHAFT.GUI.WebDriver driver;
	public LoginPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}
	
	private By emailTxt = By.id("Email");
	private By passwordTxt = By.id("Password");
	private By loginBtn = By.cssSelector("button.button-1.login-button");
	
	public void setLogFunction(String email, String password) {
		driver.element().type(emailTxt, email);
		driver.element().type(passwordTxt, password);
		driver.element().click(loginBtn);
	}

}
