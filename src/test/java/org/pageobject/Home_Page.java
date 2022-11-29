package org.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.UtilityClass;

public class Home_Page extends UtilityClass {
	public Home_Page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()=' COMPANY ']")
	private WebElement cssCompany;
	@FindBy(xpath = "(//a[text()=' Contact Us '])[2]")
	private WebElement contactUs;
	@FindBy(xpath = "(//div[text()='Let’s talk!']")
	private WebElement successMsg;
	

	public WebElement getSuccessMsg() {
		return successMsg;
	}
	public WebElement getCssCompany() {
		return cssCompany;
	}
	public WebElement getContactUs() {
		return contactUs;
	}
	public void clickCompany() {
		elementClick(getCssCompany());
	}
	public void clickContactUs() {
		elementClick(getContactUs());
	}

	public void clickCompanyUsingJS() {
		clickUsingJs(getCssCompany());
	}
	public void clickContactUsingJS() {
		clickUsingJs(getContactUs());
	}
	
}
