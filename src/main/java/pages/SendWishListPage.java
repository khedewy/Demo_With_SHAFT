package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class SendWishListPage {
	SHAFT.GUI.WebDriver driver;
	public SendWishListPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}
	
	private By friendEmail = By.id("FriendEmail");
	private By messageBox = By.id("PersonalMessage");
	private By sendBtn = By.name("send-email");
	private By assertionMessage = By.cssSelector("div.result");
	
	public void sendEmail(String emailfriend, String messaeg) {
		driver.element().type(friendEmail, emailfriend);
		driver.element().type(messageBox, messaeg);
		driver.element().click(sendBtn);
	}
	
	public String setAssertionMessaeg() {
		return driver.element().getText(assertionMessage);
	}
	
	public By getAssertionLocator() {
		return assertionMessage;
	}
}
