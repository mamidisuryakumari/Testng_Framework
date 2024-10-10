package practisepages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ElementUtils.Elements;

public class AgeCalculatorPage extends BasePage {

	public AgeCalculatorPage(WebDriver driver) {
		super(driver);
		
	}
	
	private By birthDateFld=By.id("birthDate");
	private By lastDateFld=By.id("lastDate");
	private By calculateAgeBtn1=By.xpath("//div[@id=\"post-body\"]/div[1]/div/button");
	private By calculateAgeBtn=By.id("//button[text()='Calculate Age']");
	
	public AgeCalculatorPage calculateAge(String birthDate,String lastDate) {
		Elements.doSendKeys(driver, birthDateFld,birthDate);
		Elements.doSendKeys(driver, lastDateFld, lastDate);
		Elements.doClick(driver, calculateAgeBtn1);
		return this;
		
	}

}
