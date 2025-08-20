package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.AfterStep;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.TextContextSetup;
import io.cucumber.java.Scenario;
public class Hooks {
	TextContextSetup tcs;
	public Hooks(TextContextSetup tcs)
	{
		this.tcs=tcs;
	}
	@Before
	public void BeforeHook()
	{
		WebDriver driver=tcs.tb.WebDriverManager();
		tcs.setDriver(driver);
		
	}
	@AfterStep
	public void AfterStep(Scenario scenario) throws IOException
	{
		if(scenario.isFailed()) {
			File sourceFile=((TakesScreenshot)(tcs.tb.WebDriverManager())).getScreenshotAs(OutputType.FILE);
			byte[] srcFileArray=FileUtils.readFileToByteArray(sourceFile);
			scenario.attach(srcFileArray, "image/png", "image");
			
		}
	}
	@After
	public void AfterHook()
	{
		tcs.tb.WebDriverManager().quit();
		
	}

}
