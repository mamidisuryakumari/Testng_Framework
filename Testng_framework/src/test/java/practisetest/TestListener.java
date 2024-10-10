package practisetest;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import ElementUtils.ScreenShotUtil;
import reports.ExtentReportUtils;

public class TestListener implements ITestListener{
	
	@Override
	public void onStart(ITestContext context) {
		ExtentReportUtils.initReport();
	}

	@Override
	public void onFinish(ITestContext context) {
		ExtentReportUtils.flushReport();
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		ExtentReportUtils.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ExtentReportUtils.logPass(result.getMethod().getMethodName() +"passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver=(WebDriver)result.getTestContext().getAttribute("driver");
		if(driver!=null) {
			String screenShotPath=ScreenShotUtil.takeScreenshot(driver, result.getMethod().getMethodName());
			ExtentReportUtils.logfail(result.getMethod().getMethodName() +"Failed");
			ExtentReportUtils.addScreenShot(screenShotPath);
		
		}else {
			System.out.println("Webdriver instance is null cannot take screenshot");
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentReportUtils.logInfo(result.getMethod().getMethodName() +"skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	

	

	
	

}
