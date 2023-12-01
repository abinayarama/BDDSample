package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features ="@target//failedscenarios.txt" ,
		glue= {"stepDefs"},
		dryRun = false,
	
		monochrome = true,
		plugin = {"pretty",
				"html:target\\Reports\\HtmlReport.html",
				"usage:target\\Reports\\UsageReport",
				"json:target\\reports\\JsonReport.json",
				"rerun:taget\\failedscenarios.txt"
				}
)
public class RerunRunner extends AbstractTestNGCucumberTests {

}

