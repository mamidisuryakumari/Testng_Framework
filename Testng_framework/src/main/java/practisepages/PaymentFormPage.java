package practisepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ElementUtils.Elements;

public class PaymentFormPage extends BasePage{

	public PaymentFormPage(WebDriver driver) {
		super(driver);
	}
	
	private By creditCardNoFld=By.id("cardNumber");
	private By expirationDateFld=By.id("expirationDate");
	private By cvvFld=By.id("cvv");
	private By cardHolderNameFld=By.id("cardholderName");
	private By submitBtn=By.xpath("//button[text()='Submit Payment']");
	private By closeBtn=By.xpath("//button[text()='Close']");
	
public void paymentDetails(String creditCardNo,String expirationDate,String cvv,String cvvHolderName) {
	Elements.doSendKeys(driver, creditCardNoFld, creditCardNo);
	Elements.doSendKeys(driver, expirationDateFld, expirationDate);
	Elements.doSendKeys(driver, cvvFld, cvv);
	Elements.doSendKeys(driver, cardHolderNameFld, cvvHolderName);
	Elements.doClick(driver, submitBtn);
	Elements.doClick(driver, closeBtn);
	
	
}
}
