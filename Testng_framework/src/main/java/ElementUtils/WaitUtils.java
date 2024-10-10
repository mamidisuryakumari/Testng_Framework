package ElementUtils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

	// Wait for Element Visible
	public static boolean waitForElementIsVisible(WebDriver driver, By locator, Duration timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			return Verify.verifyElementIsVisible(driver, locator);
		} catch (TimeoutException e) {
			System.err.println("Element " + locator + " is not found with in the time period");
		} catch (Exception e) {
			System.err.println("An unexpected error occured:" + e.getMessage());
		}
		return false;
	}

	// wait for Element presence
	public static boolean waitForElementIsPresence(WebDriver driver, By locator, Duration timeout) {
		try {

			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
			return Verify.verifyElementIsVisible(driver, locator);
		} catch (TimeoutException e) {
			System.err.println("Element " + locator + "is not found with in the time period");
		} catch (Exception e) {
			System.err.println("An unexpected error occured:" + e.getMessage());
		}
		return false;
	}
	//wait for element to be clickable
	public static boolean waitForElementToBeClickable(WebDriver driver, By locator, Duration timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			return Verify.verifyElementIsVisible(driver, locator);
		}catch (TimeoutException e) {
			System.err.println("Element " + locator + "is not clickable with in the time period");
		}catch (Exception e) {
			System.err.println("An unexpected error occured:" + e.getMessage());
		}
		return false;
	}
	//wait for element to be selected
	public static boolean waitForElementToBeSelected(WebDriver driver, By locator, Duration timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.elementToBeSelected(locator));
			return Verify.verifyElementIsVisible(driver, locator);
		}catch (TimeoutException e) {
			System.err.println(" Element " + locator + "is not selected with in the time period");
		}catch (Exception e) {
			System.err.println("An unexpected error occured:" + e.getMessage());
		}
		return false;
	}
	
	

	// Wait for alert
	public static boolean waitForAlertIsPresent(WebDriver driver, By locator, Duration timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.alertIsPresent());
			return Verify.verifyElementIsVisible(driver, locator);
		} catch (TimeoutException e) {
			System.err.println("Alert" +locator+ "is not found with in the time period");
		} catch (Exception e) {
			System.err.println("An unexpected error occured:" + e.getMessage());
		}
		return false;
	}

	// Wait for Window
	public static boolean waitForWindowIsPresent(WebDriver driver, By locator, Duration timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.numberOfWindowsToBe(2));
			Verify.verifyElementIsVisible(driver, locator);
			return true;
		} catch (TimeoutException e) {
			System.err.println("Window"  +locator+ "is not found with in the time period");
		} catch (Exception e) {
			System.err.println("An unexpected error occured:" + e.getMessage());
		}
		return false;
	}

	
}