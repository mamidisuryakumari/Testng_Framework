package practisepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ElementUtils.Alert;
import ElementUtils.Elements;
import ElementUtils.Window;

public class AlertPage extends BasePage {

	public AlertPage(WebDriver driver) {
		super(driver);
	}
	private By showAlertBtn=By.xpath("//button[text()='Show Alert']");
	private By showConfirmBtn=By.xpath("//button[text()='Show Confirm']");
	private By showPromptBtn=By.xpath("//button[text()='Show Confirm']");
	
    private By singleWindowBtn=By.xpath("//button[text()='Open single window']");
	//private By singleWindowBtn=By.xpath("//div[@id=\"post-body\"]/div[2]/div/button[1])");
	//private By singleWindowBtn=By.xpath("//button[normalize-space()='Open single window']");
	
	public AlertPage alertForm() {
		Elements.doClick(driver, showAlertBtn);
		Alert.acceptAlert(driver, showAlertBtn);
		return this;
	}
	
	public AlertPage switchWindow() {
		Elements.doClick(driver, singleWindowBtn);
		Window.switchToWindow(driver, singleWindowBtn);
		Window.closeWindow(driver, showAlertBtn);
		return this;
	}

}
