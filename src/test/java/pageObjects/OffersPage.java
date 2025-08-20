package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TextContextSetup;

public class OffersPage {
	WebDriver driver;	
	TextContextSetup tc;
	@FindBy(linkText ="Top Deals" )
	WebElement  offerspage;
	public void  offerspage()
	{
		offerspage.click();
	}

	@FindBy(id ="search-field" )
	WebElement  searchField;
	public void  searchingField(String vegetable)
	{
searchField.sendKeys(vegetable);
	}
	@FindBy(xpath="(//tr/td)[1] ")
	WebElement  productName;
	public String  productName()
	{
return productName.getText();

	}
	
	public OffersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
