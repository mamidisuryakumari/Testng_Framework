package practisetest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import practisepages.ContactFormPage;
import reports.ExtentReportUtils;
@Listeners(TestListener.class)
public class ContactFormPageTest extends  BaseTest{
	@Test
	public void contactDeatils() {
		ContactFormPage contactFormPage= new ContactFormPage(driver);
		contactFormPage.contactForm(properties.getProperty("name"),properties.getProperty("emailID"),properties.getProperty("message"));
		try {
			Assert.assertEquals(contactFormPage.getSuccessMsg(driver), properties.getProperty("successMsg"));
			ExtentReportUtils.logPass("Contact details added successfully");

		} catch (AssertionError e) {
			Assert.fail("Success Message  text did not match: " + properties.getProperty("successMsg"));
			ExtentReportUtils.logfail("Contact details not added :"+e.getMessage());
			
			
		}
	}

}
	