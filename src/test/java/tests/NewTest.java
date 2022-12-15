package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;




public class NewTest {
  @Test
  public void testMethode() {
	  WebDriver driver = DriverFactory.getDriver();
	  BrowserActions.navigateToURL(driver, "https://phptravels.net/");
	  ElementActions.click(driver,By.id("ACCOUNT"));
      ElementActions.click(driver, By.linkText("Agents Signup"));
      ElementActions.type(driver, By.name("first_name"), "mahmoud");
      ElementActions.type(driver, By.name("last_name"), "kheddewy");
      ElementActions.type(driver, By.name("phone"), "01205456797");
      ElementActions.type(driver, By.name("email"), "mahmoud123@gmail.com");
      ElementActions.type(driver, By.name("password"), "m0987654321");
      ElementActions.click(driver, By.id("button"));
  }
}
