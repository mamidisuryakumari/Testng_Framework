package practisetest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import practisepages.AlertPage;
@Listeners(TestListener.class)
public class AlertPageTest extends BaseTest {
	
	@Test
	public void alertTest() {
		AlertPage alertPage = new AlertPage(driver);
		
		alertPage.alertForm();
	}
	@Test(enabled = true)
	public void windowTest() {
		AlertPage alertPage = new AlertPage(driver);
		alertPage.switchWindow();
	
	}
	
}
