package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public WebDriver driver;
	public Properties prop;
	String browser_prop;
	String browser_maven;
	String browser;

	public TestBase() throws IOException
	{
		prop= new Properties();
//		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resource\\global.properties");
		FileInputStream file=new FileInputStream("C:\\Users\\Keert\\eclipse-workspace\\CucumberDemo\\src\\test\\resources\\global.properties");
		prop.load(file);
	}
	public WebDriver WebDriverManager() {
		if(driver==null){ 
		browser_prop=prop.getProperty("browser");//value comes from global.properties
		browser_maven	=System.getProperty("browser");//value comes from terminal
		//another way of writing if block.//ternary operator
		//Output_Value=TestCondition ?Value1(will execute if condition is true): Value2(if condition is false)
		browser=browser_maven!=null?browser_maven:browser_prop;
			//if(prop.getProperty("ChromeBrowser").equalsIgnoreCase("Chrome")) {
			if(browser.equalsIgnoreCase("Chrome")) {
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--headless");
				driver=new ChromeDriver(options);  
			}
			
			else if(browser.equalsIgnoreCase("Firefox")) {
		driver=new FirefoxDriver();
//				
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	return driver;
	}
public String setUrl()
{
	System.out.println(prop.getProperty("QA_URL"));
	return prop.getProperty("QA_URL");
}
}
