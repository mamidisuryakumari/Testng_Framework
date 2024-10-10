package practisetest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import practisepages.BmiCalculatorPage;
import reports.ExtentReportUtils;

@Listeners(TestListener.class)
public class BmiCalculatorTest extends BaseTest {
	@Test(groups = "error-case")
	public void calculateAgeTest() {
		BmiCalculatorPage bmiCalculatorPage = new BmiCalculatorPage(driver);
		
		bmiCalculatorPage.calculateAge(properties.getProperty("height"), properties.getProperty("inches"),
				properties.getProperty("weight"),properties.getProperty("age"));

		try {

			try {

				Assert.assertEquals(bmiCalculatorPage.getHeightErrorMsg(),
						bmiCalculatorPage.getExceptedValidHeightErrorMsg(), "Height error did not match actualtext");
				ExtentReportUtils.logPass("Invalid height validated");

			} catch (AssertionError e) {
				ExtentReportUtils.logfail("Height is valid but we should enter invalid height " + e.getMessage());
				throw e;
				

			}

			try {
				Assert.assertEquals(bmiCalculatorPage.getWeightErrorMsg(),
						bmiCalculatorPage.getExceptedWeightErrorMsg(), "Weight error did not match actualtext");
				ExtentReportUtils.logPass("Invalid weight validated-");

			} catch (AssertionError e) {
				ExtentReportUtils.logfail("Weight is valid but we should enter invalid weight : " + e.getMessage());
				throw e;
			}

			
			try {
				Assert.assertEquals(bmiCalculatorPage.getageErrorMsg(),bmiCalculatorPage.getExceptedAgeErrorMsg(),"Age error did not match actual text");
				ExtentReportUtils.logPass("Invalid Age validated");
			} catch (AssertionError e) {
				ExtentReportUtils.logfail("Age is valid but we should enter invalid Age : " + e.getMessage());
				throw e;
			}
				System.out.println(bmiCalculatorPage.getoverWeightMsg());

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}