package testLayer;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.amazon.pageLayer.HomePage;
import com.amazon.pageLayer.ProductSearchPage;
import com.amazon.testBase.TestBase;
import com.amazon.utilities.UtilPage;

import junit.framework.Assert;

public class homeTest extends TestBase {
	
	@Test(enabled=false)
	public void productSearxhFunctionality()
	{
		HomePage home_obj =new HomePage(driver);
		ProductSearchPage product_obj= new ProductSearchPage(driver);
		home_obj.EnterProductNameInto_TextField("iphone");
		
		}
	@Test
	public void dropDownFunctionality() 
	{
		
		String Actual_title="Amazon.in: Apps for Android";
		HomePage home_obj =new HomePage(driver);
		UtilPage util_obj = new UtilPage();
		home_obj.dropDown();
		String shubh = driver.getTitle();
		System.out.println(shubh);
		Assert.assertEquals(util_obj.getPageName(), Actual_title);
		
		}
	

}
