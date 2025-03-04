package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart_Page extends BasePage{

	public ShoppingCart_Page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath=("//h1[contains(text(),'Shopping Cart')]"))
	WebElement txt_shoppingcart;
	@FindBy(xpath=("//span[normalize-space()='My Account']"))
	WebElement btn_Myaccount;
	@FindBy(xpath=("//a[normalize-space()='Logout']"))
	WebElement btn_logout;
	
	public boolean val_shoppingcart()
	{
		try {
		return(txt_shoppingcart.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void clk_myacc()
	{
		btn_Myaccount.click();
	}
	
	public void clk_logout()
	{
		btn_logout.click();
	}
}
