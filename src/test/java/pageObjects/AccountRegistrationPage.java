package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath=("//input[@id='input-firstname']")) 
	WebElement txt_firstname;

	@FindBy(xpath=("//input[@id='input-lastname']"))
	WebElement txt_lastname;
	
	@FindBy(xpath=("//input[@id='input-email']"))
	WebElement txt_email;
	
	@FindBy(xpath=("//input[@id='input-telephone']"))
	WebElement txt_telephone;
	
	@FindBy(xpath=("//input[@id='input-password']"))
	WebElement txt_password;

	@FindBy(xpath=("//input[@id='input-confirm']"))
	WebElement txt_confirmpassword;
	
	@FindBy(xpath=("//input[@name='agree']"))
	WebElement chbox_privacypolicy;
	
	@FindBy(xpath=("//input[@value='Continue']"))
	WebElement btn_continue;
	
	@FindBy(xpath=("//h1[normalize-space()='Your Account Has Been Created!']"))
	WebElement msg_confirmation;
	
	public void setFirstname(String fname)
	{
		txt_firstname.sendKeys(fname);
	}
	
	public void setLastname(String lname)
	{
		txt_lastname.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txt_email.sendKeys(email);
	}
	
	public void setTelephone(String telephone)
	{
		txt_telephone.sendKeys(telephone);
	}
	
	public void setPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void setconfpassword(String password)
	{
		txt_confirmpassword.sendKeys(password);
	}
	
	public void selprivacypolicy()
	{
		chbox_privacypolicy.click();
	}
	
	public void clksubmit()
	{
		//sol1
		btn_continue.click();
		
		//sol2
		//btn_continue.submit();
		
		//sol3
		//Actions act=new Actions(driver);
		//act.moveToElement(btn_continue).click().perform();
		
		//sol4
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();",btn_continue);
		
		//sol5
		//btn_continue.sendKeys(Keys.RETURN);
		
		//sol6
		//WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10));
		//mywait.until(ExpectedConditions.elementToBeClickable(btn_continue)).click();
	}
	
	public String getconfirmation()
	{
		try 
		{
		return (msg_confirmation.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
		
	}
	
}
