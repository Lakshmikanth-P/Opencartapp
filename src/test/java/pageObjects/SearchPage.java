package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

	public SearchPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath=("//h4//a[normalize-space()='MacBook Pro']"))
	WebElement txt_Macbookpro;
	
	/*public boolean macbook()
	{
		if(txt_Macbookpro.equals("MacBook Pro"))
				{
			txt_Macbookpro.click();
				}
		return false;
		
		try {
			return(txt_Macbookpro.equals("MacBook Pro"));
		}
		catch(Exception e)
		{
			return false;
		}
		}*/
		public void select_macbook()
		{
			txt_Macbookpro.click();
		}
		
	
}
