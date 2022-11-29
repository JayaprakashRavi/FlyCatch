package org.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.utility.UtilityClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class HooksClass extends UtilityClass {
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		getDriver(getPropertyFileValue("browser"));
		enterURL(getPropertyFileValue("url"));
		
		implicitlyWaits(10);
	}

	@After
	public void afterScenario(Scenario screenShot) {
		if (screenShot.isFailed()) {
			screenShots(screenShot);
		}
	}
}