package org.pageobject;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.UtilityClass;

public class ContactUs_Page extends UtilityClass{
	public ContactUs_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="id_name")
	private WebElement username;
	@FindBy(id="id_email")
	private WebElement email;
	@FindBy(id="id_phone_no")
	private WebElement phoneNo;
	@FindBy(xpath="//span[@class='current']")
	private WebElement country;
	@FindBy(id="id_subject")
	private WebElement subject;
	@FindBy(id="id_details")
	private WebElement message;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement captcha;
	@FindBy(id="section-banner")
	private WebElement ScrollDown;
	
	public WebElement getScrollDown() {
		return ScrollDown;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPhoneNo() {
		return phoneNo;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getSubject() {
		return subject;
	}
	public WebElement getMessage() {
		return message;
	}
	public WebElement getCaptcha() {
		return captcha;
	}
	public void clickSubmit() {
		Actions action = new Actions(driver);
		getMessage().click();
		action.keyDown(Keys.TAB);action.keyUp(Keys.TAB);
		action.keyDown(Keys.TAB);action.keyUp(Keys.TAB);
		action.keyDown(Keys.TAB);action.keyUp(Keys.TAB);
		action.keyDown(Keys.TAB);action.keyUp(Keys.TAB);
		action.keyDown(Keys.ENTER);action.keyUp(Keys.ENTER).perform();;
		

	}
	public void sendMessage(String name, String email, String phone, String selectYourCountry, String subject, String message) {
		scrollDown(getScrollDown());
		elementSendkeys(getUsername(), name);
		elementSendkeys(getEmail(), email);
		elementSendkeys(getPhoneNo(), phone);
		action(getCountry());
		elementSendkeys(getSubject(), subject);
		elementSendkeys(getMessage(), message);
		clickSubmit();
	}
}
