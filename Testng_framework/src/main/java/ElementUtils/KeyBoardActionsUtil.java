package ElementUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionsUtil {
	static WebDriver driver;
	Actions actions = new Actions(driver);
	 // Method to perform keyboard actions (like pressing Enter)
    public void pressEnter() {
        actions.sendKeys(Keys.ENTER).perform();
    }

    // Method to type text in a field
    public void typeText(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.click(); // Click to focus
        actions.sendKeys(element, text).perform();
    }

    // Method to perform Ctrl + A (select all)
    public void selectAllText() {
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
    }

    // Method to perform keyboard copy (Ctrl + C)
    public void copyText() {
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
    }

    // Method to perform keyboard paste (Ctrl + V)
    public void pasteText() {
        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
    }

    // Method to simulate pressing the Tab key
    public void pressTab() {
        actions.sendKeys(Keys.TAB).perform();
    }

}
