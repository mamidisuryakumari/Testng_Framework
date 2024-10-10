package practisepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ElementUtils.Elements;

public class ContactFormPage extends BasePage{

	public ContactFormPage(WebDriver driver) {
		super(driver);
	}
	
	private By nameFld=By.id("name");
	private By emailFld=By.id("email");
	private By messageFld=By.id("message");
	private By submitFld=By.xpath("//button[text()='Submit']");
	private By successMessageFld=By.id("successMessage");
	
	public ContactFormPage contactForm(String name,String emailID,String message) {
		Elements.doSendKeys(driver, nameFld,name );
		Elements.doSendKeys(driver, emailFld, emailID);
		Elements.doSendKeys(driver, messageFld, message);
		Elements.doClick(driver, submitFld);
		
		
		return this;
		
	}
	public String getSuccessMsg(WebDriver driver) {
		return Elements.getText(driver, successMessageFld);

	}
	

}
