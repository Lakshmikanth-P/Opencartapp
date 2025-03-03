package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC1_RegisterTest extends BaseClass {

	@Test(groups= {"Regression", "Master"})
	public void val_accountregister()
	{
		
		logger.info("Log4j2 is configured and working!");

		if (logger.isInfoEnabled()) {
		    logger.info("Check if this log appears!");
		}
		
		try {
		logger.info("TC1 - Execution Started");
		HomePage hp=new HomePage(driver);
		hp.ClicMyAccount();
		hp.ClickRegister();
		
		logger.info("Passing customer detials");
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		regpage.setFirstname(randomstring().toUpperCase());
		regpage.setLastname(randomstring().toUpperCase());
		
		String email=randomstring(); // randomly generated an email
		regpage.setEmail(email+"@gmail.com"); 
		System.out.println("Email address = "+email);
		
		regpage.setTelephone(randomnumber());
		
		String password=randonAlphanumeric();
		System.out.println("Password = "+password);
		regpage.setPassword(password);
		regpage.setconfpassword(password);
		
		regpage.selprivacypolicy();
		regpage.clksubmit();
		
		logger.info("Validationg confirmation message..");
		String conf_message=regpage.getconfirmation();
		if(conf_message.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test failed");
			logger.debug("Debug logs...");
			Assert.assertTrue(false);
		}
		
		//Assert.assertEquals(conf_message, "Your Account Has Been Created!");
		//System.out.println(conf_message);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("TC1 - Execution completed");
	}
}

