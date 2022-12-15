package pages;

import org.openqa.selenium.By;


import com.shaft.driver.SHAFT;


public class SignUpPage {

	private SHAFT.GUI.WebDriver driver;
	


	public SignUpPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private By genderBtn = By.id("gender-male");
	private By firstNameTxt = By.id("FirstName");
	private By lastNameTxt = By.id("LastName");
	private By dayList = By.name("DateOfBirthDay");
	private By monthList = By.name("DateOfBirthMonth");
	private By yearList = By.name("DateOfBirthYear");
	private By emailTxt = By.id("Email");
	private By companyTxt = By.id("Company");
	private By passwordTxt = By.id("Password");
	private By confirmPassword = By.id("ConfirmPassword");
	private By registerButton = By.id("register-button");
	private By assertionMessage = By.cssSelector("div.result");
	private By erroreMessage = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[1]/strong");

	public void fillUserInformation(String firstName, String lastName, String email, String company, String password) {
		driver.element().click(genderBtn);
		driver.element().type(firstNameTxt, firstName);
		driver.element().type(lastNameTxt, lastName);
		driver.element().select(dayList, "22");
		driver.element().select(monthList, "April");
		driver.element().select(yearList, "2001");
		driver.element().type(emailTxt, email);
		driver.element().type(companyTxt, company);
		driver.element().type(passwordTxt, password);
		driver.element().type(confirmPassword, password);

	}

	public void setUserRegister() {
		driver.element().click(registerButton);

	}

	public String setAssertioNMessage() {
		return driver.element().getText(assertionMessage);
	}
	
	public String errorMessage() {
		return driver.element().getText(erroreMessage);
	}
	
	public By errorMessageLocation() {
		return erroreMessage;
	}

	public By assertionLocator() {
		return assertionMessage;

	}

}
