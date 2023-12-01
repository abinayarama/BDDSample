package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features ="src//test//resources//features//GoogleSearchPage.feature" 
)
public class NewTest extends AbstractTestNGCucumberTests {

}
