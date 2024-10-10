package practisetest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import practisepages.AdvancedRegistrationPage;
import reports.ExtentReportUtils;

@Listeners(TestListener.class)
public class AdvancedRegisterPageTest extends BaseTest {

	@Parameters("baseUrl")
	@Test
	public void userDetails(String baseUrl) {
		driver.get(baseUrl);

		AdvancedRegistrationPage advancedRegistrationPage = new AdvancedRegistrationPage(driver);
		advancedRegistrationPage.advancedRegistrationForm(properties.getProperty("userName"),
				properties.getProperty("password"), properties.getProperty("email"), properties.getProperty("value"),
				properties.getProperty("date"));
		try {
			Assert.assertEquals(advancedRegistrationPage.getUserNameErrorMsg(driver),
					advancedRegistrationPage.getExpecteduserNameErrorMsg(), "Username error did'nt match with acutal");
			ExtentReportUtils.logPass("Valid userName entered");

			 Assert.assertEquals(advancedRegistrationPage.getPasswordErrorMsg(driver),
					 advancedRegistrationPage.getExpectedPasswordErrorMsg(),"Inalid password error message");
			 ExtentReportUtils.logPass("Valid password entered");

		} catch (AssertionError e) {
			Assert.fail("Actual msg and expected msg did not match: ");
			ExtentReportUtils.logfail("Test failed" + e.getMessage());

		}

	}
}
