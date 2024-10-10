package practisetest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import practisepages.AgeCalculatorPage;
@Listeners(TestListener.class)
public class AgeCalculatorTest extends BaseTest{
@Test

	public void calculateAgeTest() {
		AgeCalculatorPage ageCalculatorPage= new AgeCalculatorPage(driver);
		ageCalculatorPage.calculateAge(properties.getProperty("birthDate"),properties.getProperty("lastDate"));
	}
}
