package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;


/*Data is valid  -  login success - test pass - logout
 					login failed - test fail

Data is invalid - login success - test fail - logout
					login failed - test pass
 */


public class TC3_LoginDDT extends BaseClass {

	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class) //getting dataProvider from different class
	public void verify_loginDDT(String email, String pwd, String exp)
	{
		
	logger.info("***** TC3 Execution Started *****");
		
	try {
	HomePage hp=new HomePage(driver);
	hp.ClicMyAccount();
	hp.clicklogin();
	
	Loginpage lp=new Loginpage(driver);
	lp.setemail(email);
	lp.setpassword(pwd);
	lp.clklogin();
	
	MyAccountPage myacc=new MyAccountPage(driver);
	boolean val=myacc.val_myaccount();
	
	if(exp.equalsIgnoreCase("Valid"))
	{
		if(val==true)
		{
			myacc.clk_logout();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	if(exp.equalsIgnoreCase("Invalid"))
	{
		if(val==true)
		{
			myacc.clk_logout();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}  
	}
	}
	catch(Exception e)
	{
		Assert.fail();
	}
	
	logger.info("**** TC3 Execution Ended ****");
	
	}
	
}
