package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDescription_Page extends BasePage{

	
	public ProductDescription_Page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath=("//input[@id='input-quantity']"))
	WebElement txt_quantity;
	@FindBy(xpath=("//button[@id='button-cart']"))
	WebElement btn_addtocart;
	@FindBy(xpath=("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']"))
	WebElement btn_cart;
	@FindBy(xpath=("//strong[normalize-space()='View Cart']"))
	WebElement btn_viewcart;
	
	
	public void Quantity()
	{
		txt_quantity.clear();
		txt_quantity.sendKeys("2");
	}
	
	public void addtocart()
	{
		btn_addtocart.click();
	}
	
	public void cart()
	{
		btn_cart.click();
	}
	
	public void viewcart()
	{
		btn_viewcart.click();
	}
}
