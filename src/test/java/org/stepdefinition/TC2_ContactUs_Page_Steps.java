package org.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.pagemanger.PageObjectManager;
import cucumber.api.java.en.Then;

public class TC2_ContactUs_Page_Steps {
	PageObjectManager pom = new PageObjectManager();
	@Then("User should Send Message using {string},{string},{string},{string},{string} and {string}")
	public void userShouldSendMessageUsingAnd(String name, String email, String phone, String selectYourCountry, String subject, String message) throws FileNotFoundException, IOException  {
	  	pom.getContactUs_Page().sendMessage(name, email, phone, selectYourCountry, subject, message);
	}
	@Then("User should verify after success message {string}")
	public void userShouldVerifyAfterSuccessMessage(String string) {
		
	}
}
