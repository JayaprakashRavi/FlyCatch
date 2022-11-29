package org.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Assert;
import org.pagemanger.PageObjectManager;
import org.utility.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC1_Home_Page_Steps extends UtilityClass {
	PageObjectManager pom = new PageObjectManager();

	@Given("User is on the FlyCatch page")
	public void userIsOnTheFlyCatchPage() {
	}

	@When("User should navigate to Company CSS Dropdown")
	public void userShouldNavigateToCompanyCSSDropdown() {
		pom.getHome_Page().clickCompany();
	}

	@Then("User should click Contact_Us")
	public void userShouldClickContact_Us() {
		pom.getHome_Page().clickContactUs();
	}

	@When("User should navigate to Company CSS Dropdown using JS")
	public void userShouldNavigateToCompanyCSSDropdownUsingJS() {
		pom.getHome_Page().clickCompanyUsingJS();
	}

	@Then("User should click Contact_Us using JS")
	public void userShouldClickContact_UsUsingJS() {
		pom.getHome_Page().clickContactUsingJS();
	}

	@Then("User should verify after Navigated to Contact_Us")
	public void userShouldVerifyAfterNavigatedToContact_Us() throws FileNotFoundException, IOException {
		Assert.assertEquals("verify ContactUs Page", getPropertyFileValue("expectedUrl"), getCurrentUrl());
	}
}
