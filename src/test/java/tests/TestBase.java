package tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.google.common.io.Files;
import com.shaft.driver.SHAFT;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class TestBase extends AbstractTestNGCucumberTests {
	public static SHAFT.GUI.WebDriver driver;
	SHAFT.TestData.JSON jsonData;

	@BeforeClass
	public void setDriver() {

		driver = new SHAFT.GUI.WebDriver();
		jsonData = new SHAFT.TestData.JSON("RegisterData.json");

		driver.browser().navigateToURL("https://demo.nopcommerce.com/");
	}

	@AfterClass
	public void setCloseDriver() {
		driver.quit();
	}

	@AfterMethod
	public void takeScreenShots(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			TakesScreenshot screen = (TakesScreenshot) driver;
			File file = screen.getScreenshotAs(OutputType.FILE);
			Files.move(file, new File("resources/Screenshots" + result.getName() + ".png"));
		}
	}

}
