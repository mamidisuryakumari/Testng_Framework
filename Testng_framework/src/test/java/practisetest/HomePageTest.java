package practisetest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ElementUtils.ScreenShotUtil;
import practisepages.HomePage;
@Listeners(TestListener.class)
public class HomePageTest extends BaseTest {
@Test
	public void method() {
		HomePage homePage = new HomePage(driver);
		ScreenShotUtil.takeScreenshot(driver,"Befor screenShot");
		homePage.differentForms();
	
	}

}
