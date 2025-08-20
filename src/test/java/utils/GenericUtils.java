package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;
	public GenericUtils(WebDriver driver)
	{
	this.driver=driver;	
	}
	public void switchingWindows()
	{
		Set<String> d=	   driver.getWindowHandles();
		Iterator<String> f=d.iterator();
		f.next();
		String s=f.next();
		driver.switchTo().window(s);	
	}

}
