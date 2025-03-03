package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC2_LoginTest extends BaseClass{
	
	@Test(groups= {"Sanity", "Master"})
	public void login_myAccount()
	{
		logger.info("***** TC2_LoginTest Started *****");
		
		try
		{
		HomePage hp=new HomePage(driver);
		hp.ClicMyAccount();
		hp.clicklogin();
		
		Loginpage lp=new Loginpage(driver);
		lp.setemail(p.getProperty("email"));
		lp.setpassword(p.getProperty("password"));
		lp.clklogin();
		
		MyAccountPage myacc=new MyAccountPage(driver);
		boolean val=myacc.val_myaccount();
		Assert.assertTrue(val);
		//Assert.assertEquals(val, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("***** TC2_LoginTest completed****");
			
	}

}
