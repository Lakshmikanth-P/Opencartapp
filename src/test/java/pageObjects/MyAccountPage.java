package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath=("//h2[normalize-space()='My Account']"))
	WebElement txt_myaccount;
	@FindBy(xpath=("//a[@class='list-group-item'][normalize-space()='Logout']"))
	WebElement btn_logout;
	@FindBy(xpath=("//input[@placeholder='Search']"))
	WebElement txtbox_searcharea;
	@FindBy(xpath=("//button[@class='btn btn-default btn-lg']"))
	WebElement btn_search;
	
	public boolean val_myaccount()
	{
		try
		{	
		return (txt_myaccount.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void clk_logout()
	{
		btn_logout.click();
	}
	
	public void search_product(String product)
	{
		txtbox_searcharea.sendKeys(product);
	}
	
	public void clk_search()
	{
		btn_search.click();
	}
	
	
	
	
}
