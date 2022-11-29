package org.runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.Reporting;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(tags = "",
	features = "src\\test\\resources",
	glue = "org.stepdefinition",
	snippets = SnippetType.CAMELCASE, 
	dryRun = false,
	monochrome = true,
	plugin = {"json:target\\Output.json" })

	public class TestRunner {
		@AfterClass
		public static void reporting() {
			Reporting.generateJVMreport(
				System.getProperty("user.dir")+"\\target\\Output.json");

		}
	}
	


