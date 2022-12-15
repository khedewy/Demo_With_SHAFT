package tests;

import org.testng.annotations.Test;

import pages.HoverPage;

public class HoverTest extends TestBase {
	HoverPage hover;

	@Test
	public void HoverOverComputers() {
		hover = new HoverPage(driver);
		hover.HoverOverComputer();
		driver.assertThat().element(hover.getassertionLocator()).text().contains("Notebooks").perform();
		driver.browser().navigateBack();
		}

	@Test(priority = 1)
	public void HoverOverSoftware() {
		hover = new HoverPage(driver);
		hover.HoverOverSoftwar();
		driver.assertThat().element(hover.getSoftwarAssrtionLocator()).text().contains("Software").perform();
	}
}
