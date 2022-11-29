package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	public static void generateJVMreport(String jsonFile) {
		File file = new File(System.getProperty("user.dir")+"\\target");
		Configuration con = new Configuration(file, "FlyCatch");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("Browserversion", "108");
		con.addClassifications("OS", "Windows11");
		con.addClassifications("Sprint", "1");

		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(jsonFiles, con);
		builder.generateReports();

	}
}
