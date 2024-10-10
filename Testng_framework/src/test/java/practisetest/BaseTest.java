package practisetest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import driverUtils.DriverManager;
import reports.ExtentReportUtils;

public class BaseTest {
	protected WebDriver driver;
	protected Properties properties;
	private String filepath = "./src/test/resources/config.properties";
	static ExtentSparkReporter extentSparkReporter;
	static ExtentReports extentReport;
	
	@BeforeClass(alwaysRun = true)
	public void extentReportSetUp () {
		ExtentReportUtils.initReport();
		/*extentSparkReporter = new ExtentSparkReporter("extentReport.html");
		extentSparkReporter.config().setDocumentTitle("Automation Report");
		extentSparkReporter.config().setReportName("Functional Testing");

		extentReport = new ExtentReports();
		extentReport.attachReporter(extentSparkReporter);*/
		}

	@BeforeMethod(alwaysRun = true)
	public void startDriver(ITestContext context) throws IOException, InterruptedException {
      properties =new Properties();
      FileInputStream fileInputStream = new FileInputStream(filepath);
      try {
    	  properties.load(fileInputStream);
    	  fileInputStream.close();
      }catch (Exception e) {
		e.printStackTrace();
	}
     
    driver = DriverManager.initializeDriver( properties.getProperty("browerName"));
    driver.get(properties.getProperty("baseUrl"));
    Thread.sleep(5000);
    context.setAttribute("driver", driver);
	};
	
	@AfterMethod(alwaysRun = true)
public void quitDriver() {
		if(driver!=null) {
		driver.quit();
	}
}
	@AfterClass(alwaysRun = true)
	public void flushExtenReports() {
		ExtentReportUtils.flushReport();
}
}