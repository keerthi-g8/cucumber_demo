

package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.TextContextSetup;

public class LandingPage {
	WebDriver driver;
	public void LandingPageNav(String url) {
//		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.get(url);
	}
	@FindBy(className ="search-keyword" )
	WebElement searchBox;
	public void searchBox(String vegetable)
	{
		searchBox.sendKeys(vegetable);
	}
//	@FindBy(xpath ="//h4[.='Tomato - 1 Kg']" )
//	WebElement findingProductName;
//	public String findingProductName()
//	
//	{
//	return	findingProductName.getText().split("-")[0].trim();
//	}
	public String findingProductName(String shortName) throws InterruptedException {
		Thread.sleep(1000);
		 WebElement product =driver.findElement(By.xpath("//h4"));
		 
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated( By.xpath("//h4[contains(text(), '" + shortName + "')]")));
	    return product.getText().split("-")[0].trim();
	}
public LandingPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
}
