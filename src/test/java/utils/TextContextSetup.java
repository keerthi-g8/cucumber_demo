package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import stepDefinitions.PageObjectManager;

public class TextContextSetup {
	public TestBase tb;
	public WebDriver driver;
	public PageObjectManager pom;
	public GenericUtils gu;
	public String str1;
	public String str2;
	public String QA_URL;
	
	public TextContextSetup() throws IOException {
		tb=new TestBase();
		QA_URL=tb.setUrl();
		driver=null;
		pom=null;
		gu=null;
		
	}
public void setDriver(WebDriver driver) {
	driver=tb.WebDriverManager();
	pom=new PageObjectManager(driver);
	gu=new GenericUtils(driver);
}
	
}
