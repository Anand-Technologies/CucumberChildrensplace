package project.StepDefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JvmReports {

	public static void generateJvmReports(String json) {
		
		File f = new File("C:\\GreensTechnology\\CucumberChildrensplace\\target\\JvmReport");
		
		Configuration con = new Configuration(f, "Project search functionality report");
		con.addClassifications("Platform", "Windows");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("Version", "78.0");
		con.addClassifications("Sprint", "3");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(json);
		
		ReportBuilder r= new ReportBuilder(jsonFiles, con);
		r.generateReports();
		
	}
}
