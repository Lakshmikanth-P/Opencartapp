package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import pageObjects.ProductDescription_Page;
import pageObjects.SearchPage;
import pageObjects.ShoppingCart_Page;
import testBase.BaseClass;

public class TC4_AddtoCartTest extends BaseClass {

	
	@Test(groups="Master")
	public void AddtoCart()
	{
		logger.info("TC4 Execution Started");
		try {
		HomePage hp=new HomePage(driver);
		hp.ClicMyAccount();
		hp.clicklogin();
		
		Loginpage lp=new Loginpage(driver);
		lp.setemail(p.getProperty("email"));
		lp.setpassword(p.getProperty("password"));
		lp.clklogin();
		logger.info("Login successfull with valid credantials");
		
		MyAccountPage mac=new MyAccountPage(driver);
		mac.val_myaccount();
		mac.search_product(p.getProperty("search"));
		mac.clk_search();
		
		SearchPage sp=new SearchPage(driver);
		//boolean value=sp.macbook();
		//Assert.assertTrue(value);
		sp.select_macbook();
		logger.info("Selected Macbook");
		
		ProductDescription_Page pdp= new ProductDescription_Page(driver);
		pdp.Quantity();
		pdp.addtocart();
		Thread.sleep(3000);
		pdp.cart();
		pdp.viewcart();
		logger.info("Macbook added to cart");
		
		ShoppingCart_Page scp= new ShoppingCart_Page(driver);
		boolean valtxt=scp.val_shoppingcart();
		Assert.assertTrue(valtxt);
		scp.clk_myacc();
		scp.clk_logout();
		logger.info("product available for checkout");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("TC4 Execution Completed");
	}
}
