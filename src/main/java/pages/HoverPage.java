package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class HoverPage {
	private SHAFT.GUI.WebDriver driver;

	public HoverPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	// hover over computers
	private By Computers = By.linkText("Computers");
	private By noteBooks = By.linkText("Notebooks");
	private By softwar = By.linkText("Software");
	private By assertionMessage = By.cssSelector(".page-title > h1:nth-child(1)");
	private By softwarAssertion = By.cssSelector("div.page-title");

	public void HoverOverComputer() {
		driver.element().hover(Computers);
		driver.element().click(noteBooks);
	}
	public void HoverOverSoftwar() {
		driver.element().hover(Computers);
		driver.element().click(softwar);
	}

	public String getAssertionText() {
		return driver.element().getText(assertionMessage);
	}

	public By getassertionLocator() {
		return assertionMessage;
	}
	public String setSoftwarAssertion() {
		return driver.element().getText(softwarAssertion);
	}
	public By getSoftwarAssrtionLocator() {
		return softwarAssertion;
	}


}
