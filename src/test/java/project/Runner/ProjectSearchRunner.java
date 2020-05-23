package project.Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import project.StepDefinition.JvmReports;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src\\test\\resources\\Search.feature"},glue= {"project.StepDefinition"},
      monochrome=true,dryRun=false,plugin= {"html:C:\\GreensTechnology\\CucumberChildrensplace\\Reports" ,
    		  		"json:C:\\GreensTechnology\\CucumberChildrensplace\\Reports\\output.json"})

public class ProjectSearchRunner {

	@AfterClass
	public static void reportGeneration() {
		JvmReports.generateJvmReports("C:\\GreensTechnology\\CucumberChildrensplace\\Reports\\output.json1");
	}	
}
