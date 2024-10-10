package practisetest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ElementUtils.ScreenShotUtil;
import practisepages.SurveyFormPage;
@Listeners(TestListener.class)
public class SurveyFormPageTest extends BaseTest{
	@Parameters("baseUrl1")
	@Test
	public void SurveyFormPageTest(String baseUrl1){
		driver.get(baseUrl1);
		SurveyFormPage surveyFormPage=new SurveyFormPage(driver);
		ScreenShotUtil.takeScreenshot(driver, "Before screenShot");
		surveyFormPage.surveyFormDetails();
	}

}
