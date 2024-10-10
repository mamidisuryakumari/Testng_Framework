package practisetest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import practisepages.PaymentFormPage;

@Listeners(TestListener.class)
public class PaymentFormTest extends BaseTest{
	@Test
	public void paymentFormDetails() {
		PaymentFormPage paymentFormPage=new PaymentFormPage(driver);
		paymentFormPage.paymentDetails(properties.getProperty("creditCardNumber"), 
				properties.getProperty("expirationDate"), properties.getProperty("cvv"),
		properties.getProperty("cardholderName"));
	}
	
	

}
