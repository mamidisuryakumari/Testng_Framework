package ElementUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsUtil {
	private static boolean bstatus;
	static WebDriver driver;
	
	Actions actions = new Actions(driver);
	
	//move to element
	
		public static boolean moveToElement(WebDriver driver, By locator) {
			bstatus=WaitUtils.waitForElementIsPresence(driver, locator, Constants.maxWaitTime);
			if(bstatus) {
		    Actions actions = new Actions(driver);
		    WebElement element = driver.findElement(locator);
		    actions.moveToElement(element).perform();
		    return true;
		}else {
			return false;
		}
		}
	
	 // Method to navigate back to the previous page
    public void navigateBack() {
        driver.navigate().back();
    }

    // Method to refresh the current page
    public void refreshPage() {
        driver.navigate().refresh();
    }

	
		 public void hoverOverElement(By locator) {
		        WebElement element = driver.findElement(locator);
		        actions.moveToElement(element).perform();
		    }

		    // Method to perform right-click on an element
		    public void rightClickOnElement(By locator) {
		        WebElement element = driver.findElement(locator);
		        actions.contextClick(element).perform();
		    }

		    // Method to double-click on an element
		    public void doubleClickOnElement(By locator) {
		        WebElement element = driver.findElement(locator);
		        actions.doubleClick(element).perform();
		    }

		    // Method to drag and drop from one element to another
		    public void dragAndDrop(By sourceLocator, By targetLocator) {
		        WebElement source = driver.findElement(sourceLocator);
		        WebElement target = driver.findElement(targetLocator);
		        actions.dragAndDrop(source, target).perform();
		    }
		    
		 // Method to scroll to an element
		    public void scrollToElement(By locator) {
		        WebElement element = driver.findElement(locator);
		        actions.moveToElement(element).perform();
		    }

}
