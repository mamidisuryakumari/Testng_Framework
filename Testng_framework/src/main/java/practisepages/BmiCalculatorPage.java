package practisepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ElementUtils.Elements;

public class BmiCalculatorPage extends BasePage {

	public BmiCalculatorPage(WebDriver driver) {
		super(driver);
	}

	private By feetFld = By.id("heightFeet");
	private By heightErrorMsg = By.id("heightError");
	private By heightinchesFld = By.id("heightInches");
	private By weightFld = By.id("weight");
	private By weightErrorMsg = By.id("weightError");
	private By genderErrorMsg = By.id("genderError");
	private By femaleFld = By.id("female");
	private By ageFld = By.id("age");
	private By ageErrorMsg = By.id("ageError");
	private By calculateBmiBtn = By.id("calculateBtn");
	private By resetBtn = By.id("resetBtn");
	private By overWeightMsg = By.id("result");

	private String ExpectedoverWeightMsgText = "";
	private String ExceptedValidHeightErrorMsg = "Please enter a valid height.";
	private String ExceptedWeightErrorMsg = "Please enter a valid weight between 20 kg and 300 kg.";
	private String ExceptedGenderErrorMsg = "Please select your gender.";
	private String ExceptedAgeErrorMsg = "Please enter a valid age between 5 and 120 years.";
	
	

	public String getExceptedWeightErrorMsg() {
		return ExceptedWeightErrorMsg;
	}

	public void setExceptedWeightErrorMsg(String exceptedWeightErrorMsg) {
		ExceptedWeightErrorMsg = exceptedWeightErrorMsg;
	}

	public String getExceptedGenderErrorMsg() {
		return ExceptedGenderErrorMsg;
	}

	public void setExceptedGenderErrorMsg(String exceptedGenderErrorMsg) {
		ExceptedGenderErrorMsg = exceptedGenderErrorMsg;
	}

	public String getExceptedAgeErrorMsg() {
		return ExceptedAgeErrorMsg;
	}

	public void setExceptedAgeErrorMsg(String exceptedAgeErrorMsg) {
		ExceptedAgeErrorMsg = exceptedAgeErrorMsg;
	}

	public String getHeightErrorMsg() {
		return Elements.getText(driver, heightErrorMsg);
	}

	public String getoverWeightMsg() {
		return Elements.getText(driver, overWeightMsg);
	}

	public String getWeightErrorMsg() {
		return Elements.getText(driver, weightErrorMsg);
	}

	public String getGenderErrorMsg() {
		return Elements.getText(driver, genderErrorMsg);
	}

	public String getageErrorMsg() {
		return Elements.getText(driver, ageErrorMsg);
	}

	public String getExpectedoverWeightMsgText() {
		return ExpectedoverWeightMsgText;
	}

	public void setExpectedoverWeightMsgText(String expectedoverWeightMsgText) {
		ExpectedoverWeightMsgText = expectedoverWeightMsgText;
	}

	public String getExceptedValidHeightErrorMsg() {
		return ExceptedValidHeightErrorMsg;
	}

	public void setExceptedValidHeightErrorMsg(String exceptedValidHeightErrorMsg) {
		ExceptedValidHeightErrorMsg = exceptedValidHeightErrorMsg;
	}

	public BmiCalculatorPage calculateAge(String height, String inches, String weight, String age) {
		Elements.doSendKeys(driver, feetFld, height);
		Elements.doSendKeys(driver, heightinchesFld, inches);
		Elements.doSendKeys(driver, weightFld, weight);
		Elements.doClick(driver, femaleFld);
		Elements.doClick(driver, femaleFld);
		Elements.doSendKeys(driver, ageFld, age);
		Elements.doClick(driver, calculateBmiBtn);
		Elements.doClick(driver, resetBtn);

		return this;
	}

}
