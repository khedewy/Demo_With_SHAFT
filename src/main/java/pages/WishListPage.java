package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class WishListPage {
	private SHAFT.GUI.WebDriver driver;
	
	public WishListPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}
	
	private By quantityBox = By.name("itemquantity11218");
	private By deleteItem = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr[1]/td[8]/button");
	private By updateCart = By.id("updatecart");
	private By emailToFrindBtn = By.cssSelector("button.button-2.email-a-friend-wishlist-button");
	
	public void deleteItem() {
		driver.element().click(deleteItem);
	}
	
	public SendWishListPage navigateToEmailPage() {
		driver.element().click(emailToFrindBtn);
		return new SendWishListPage(driver);
	}

}
