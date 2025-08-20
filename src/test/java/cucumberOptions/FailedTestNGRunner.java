package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="@target/failedScenarios.txt", glue = "stepDefinitions", plugin = {
		"pretty", "html:target/cucumber.html", "json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failedScenarios.txt" }, tags = "@kee123",dryRun=false)
public class FailedTestNGRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel=false)
public Object[][] scenarios()
	{
		return super.scenarios();
		
	}

}
