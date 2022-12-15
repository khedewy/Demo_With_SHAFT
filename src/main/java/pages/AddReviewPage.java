package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class AddReviewPage {
	private SHAFT.GUI.WebDriver driver;
	
	public AddReviewPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}
	
	private By reviewTitleTxt = By.id("AddProductReview_Title");
	private By reviewMessage = By.id("AddProductReview_ReviewText");
	private By rateRadioBtn = By.id("addproductrating_3");
	private By submitReview = By.name("add-review");
	private By reviewAssertion = By.cssSelector("div.result");
	
	public void addReview(String title, String message) {
		driver.element().type(reviewTitleTxt, title);
		driver.element().type(reviewMessage, message);
		driver.element().click(rateRadioBtn);
		driver.element().click(submitReview);
	}
	
	public String assertionText() {
		return driver.element().getText(reviewAssertion);
	}
	public By getAssertionLocator() {
		return reviewAssertion;
	}

}
