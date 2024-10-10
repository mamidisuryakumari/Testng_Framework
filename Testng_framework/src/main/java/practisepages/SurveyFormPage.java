package practisepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ElementUtils.Elements;

public class SurveyFormPage extends BasePage {

	public SurveyFormPage(WebDriver driver) {
		super(driver);
	}
	private By Question1value=By.xpath("//form[@id=\"surveyForm\"]/div[1]/div/label[3]/input");
	private By Question2value=By.xpath("//form[@id=\"surveyForm\"]/div[2]/div/label[2]/input");
	private By Question3value=By.xpath("//form[@id=\"surveyForm\"]/div[3]/div/label[1]/input");
	private By Question4value=By.xpath("//form[@id=\"surveyForm\"]/div[4]/div/label[2]/input");
	private By Question5value=By.xpath("//form[@id=\"surveyForm\"]/div[5]/div/label[1]/input");
	private By submitFld=By.xpath("//button[@onclick='submitForm()']");
	
	
	
	
	public SurveyFormPage surveyFormDetails() {
		Elements.doClick(driver, Question1value);
		Elements.doClick(driver, Question2value);
		Elements.doClick(driver, Question3value);
		Elements.doClick(driver, Question4value);
		Elements.doClick(driver, Question5value);
		Elements.doClick(driver, submitFld);
		
		return this;
	}

}
