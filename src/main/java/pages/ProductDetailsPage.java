package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class ProductDetailsPage {

	private SHAFT.GUI.WebDriver driver;

	public ProductDetailsPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	// add to cart
	private By addTocartBtn = By.id("add-to-cart-button-4");
	private By addToCartAgain = By.id("add-to-cart-button-6");
	private By showCartBtn = By.linkText("shopping cart");

	public AddToCartPage userCanAddToCart() {
		driver.element().click(addTocartBtn);
		driver.element().click(showCartBtn);
		return new AddToCartPage(driver);
	}

	public AddToCartPage addToCartAgain() {
		driver.element().click(addToCartAgain);
		driver.element().click(showCartBtn);
		return new AddToCartPage(driver);
	}

	// add to wish list
	private By addToWishListBtn = By.id("add-to-wishlist-button-4");
	private By addTowishlistAgain = By.id("add-to-wishlist-button-1");
	private By showWishList = By.linkText("wishlist");

	public WishListPage navigateoWwishlist() {
		driver.element().click(addToWishListBtn);
		driver.element().click(showWishList);
		return new WishListPage(driver);
	}

	public WishListPage addToWishListAgain() {
		driver.element().click(addTowishlistAgain);
		driver.element().click(showWishList);
		return new WishListPage(driver);
	}

	// add your review
	private By addReview = By.linkText("Add your review");

	public AddReviewPage navigaetToAddReview() {
		driver.element().click(addReview);
		return new AddReviewPage(driver);

	}
	
	// add to compare list 
	private By addToCompareList = By.cssSelector("button.add-to-compare-list-button:nth-child(1)");
	private By viewCompareList = By.linkText("product comparison");
	private By firstAddAssertion = By.cssSelector("tr.product-name > td:nth-child(2) > a:nth-child(1)");
	private By secondAddAssertion = By.cssSelector("tr.product-name > td:nth-child(2) > a:nth-child(1)");
	
	public void addToComparelist() {
		driver.element().click(addToCompareList);
		driver.element().click(viewCompareList);
	}
	
	public String firstAssertionText() {
		return driver.element().getText(firstAddAssertion);
	}
	public By firstAssertionLocator() {
		return firstAddAssertion;
	}
	public String secondAssertionText() {
		return driver.element().getText(secondAddAssertion);
	}
	public By secondAssertionLocator() {
		return secondAddAssertion;
	}
	

	// build computer options
	private By RAM = By.id("product_attribute_2");
	private By HHd = By.id("product_attribute_3_6");

	public void BuildComputer() {
		driver.element().select(RAM, "4GB [+$20.00]");
		driver.element().click(HHd);
	}

}
