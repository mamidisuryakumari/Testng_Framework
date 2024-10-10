package practisepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ElementUtils.Elements;
import ElementUtils.MouseActionsUtil;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	private By seleniumFld = By.xpath("//ul[@id='rankify-pro-main-menu-nav']/li[2]/a");
	// private By differentformsFld =
	// By.xpath("//ul[@id='main-mobile-nav']/li[2]/ul/li[1]/a");
	private By differentformsFld = By.xpath(
			"//ul[@id='rankify-pro-main-menu-nav']//li[@class='has-sub']//ul[@class='sub-menu m-sub']//li//a[@role='menuitem'][normalize-space()='Different forms']");
	private By AdvancedRegisterLink = By.xpath("//a[@id='text_form1']");

	public AdvancedRegistrationPage differentForms() {
		MouseActionsUtil.moveToElement(driver, seleniumFld);
		MouseActionsUtil.moveToElement(driver, differentformsFld);
		Elements.doClick(driver, differentformsFld);
		Elements.doClick(driver, AdvancedRegisterLink);
		return new AdvancedRegistrationPage(driver);

	}

}
