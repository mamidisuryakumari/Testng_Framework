package practisepages;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ElementUtils.DropdownUtil;
import ElementUtils.Elements;

public class AdvancedRegistrationPage extends BasePage {

	public AdvancedRegistrationPage(WebDriver driver) {
		super(driver);

	}

	private By userNameFld = By.id("username");
	private By userNameErrorFld = By.id("usernameError");
	private By passwordFld = By.id("password");
	private By passwordErrorFld = By.id("passwordError");
	private By emailIdFld = By.id("email");
	private By emailIdErrorFld = By.id("emailError");
	private By femaleId = By.id("female");
	private By femaleIdErrorFld = By.id("genderError");
	private By moviesFld = By.id("movies");
	private By countryFld = By.id("country");
	private By countryErrorMsg=By.id("countryError");
	private By dateFld = By.xpath("//input[@id='dob']");
	private By dateErrorMsg=By.id("dobError");
	private By registerBtn = By.xpath("//button[text()='Register']");
	private By closeBtn=By.xpath("//button[text()='Close']");
	public String getExpectedPasswordErrorMsg() {
		return expectedPasswordErrorMsg;
	}

	public void setExpectedPasswordErrorMsg(String expectedPasswordErrorMsg) {
		this.expectedPasswordErrorMsg = expectedPasswordErrorMsg;
	}

	public String getExceptedEmailErrorMsg() {
		return exceptedEmailErrorMsg;
	}

	public void setExceptedEmailErrorMsg(String exceptedEmailErrorMsg) {
		this.exceptedEmailErrorMsg = exceptedEmailErrorMsg;
	}

	public String getExceptedGenderErrorMsg() {
		return exceptedGenderErrorMsg;
	}

	public void setExceptedGenderErrorMsg(String exceptedGenderErrorMsg) {
		this.exceptedGenderErrorMsg = exceptedGenderErrorMsg;
	}

	public String getExceptedCountryErrorMsg() {
		return exceptedCountryErrorMsg;
	}

	public void setExceptedCountryErrorMsg(String exceptedCountryErrorMsg) {
		this.exceptedCountryErrorMsg = exceptedCountryErrorMsg;
	}

	public String getExcepteddateofBirthErrorMsg() {
		return excepteddateofBirthErrorMsg;
	}

	public void setExcepteddateofBirthErrorMsg(String excepteddateofBirthErrorMsg) {
		this.excepteddateofBirthErrorMsg = excepteddateofBirthErrorMsg;
	}

	

	private String expecteduserNameErrorMsg = "Username must be between 3 and 15 characters.";
	private String expectedPasswordErrorMsg = "Password must be between 6 and 20 characters.";
	private String exceptedEmailErrorMsg = "Please enter a valid email address.";
	private String exceptedGenderErrorMsg = "Please select your gender.";
	private String exceptedCountryErrorMsg = "Please select your country.";
	private String excepteddateofBirthErrorMsg="Please select your date of birth.";

	

	public String getExpecteduserNameErrorMsg() {
		return expecteduserNameErrorMsg;
	}

	public void setExpecteduserNameErrorMsg(String expecteduserNameErrorMsg) {
		this.expecteduserNameErrorMsg = expecteduserNameErrorMsg;
	}

	public AdvancedRegistrationPage advancedRegistrationForm(String userName, String password, String email,
			String value, String date) {
		Elements.doSendKeys(driver, userNameFld, userName);

		Elements.doSendKeys(driver, passwordFld, password);
		Elements.doSendKeys(driver, emailIdFld, email);
		Elements.doClick(driver, femaleId);
		Elements.doClick(driver, moviesFld);
		Elements.doClick(driver, countryFld);
		DropdownUtil.selectByValue(driver, countryFld, value);
		// Elements.doClick(driver, dateFld);

		Elements.doSendKeys(driver, dateFld, date);
		Elements.doClick(driver, registerBtn);
		Elements.doClick(driver, closeBtn);
		return this;
	}

	public String getUserNameErrorMsg(WebDriver driver) {
		return Elements.getText(driver, userNameErrorFld);
	}
	public String getPasswordErrorMsg(WebDriver driver) {
		return Elements.getText(driver, passwordErrorFld);
	}

}
