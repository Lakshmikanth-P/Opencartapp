package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends BasePage{
	
	public Loginpage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath=("//input[@id='input-email']"))
	WebElement txt_email;
	@FindBy(xpath=("//input[@id='input-password']"))
	WebElement txt_password;
	@FindBy(xpath=("//input[@value='Login']"))
	WebElement btn_login;
	
	public void setemail(String mail)
	{
		txt_email.sendKeys(mail);
	}
	
	public void setpassword(String pswd)
	{
		txt_password.sendKeys(pswd);
	}
	
	public void clklogin()
	{
		btn_login.click();
	}
	
	
}
