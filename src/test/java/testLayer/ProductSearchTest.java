package testLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.amazon.pageLayer.HomePage;
import com.amazon.pageLayer.ProductSearchPage;
import com.amazon.testBase.TestBase;

public class ProductSearchTest extends TestBase {
	@Test(enabled = true)
	public void addtocardFunctionality() throws InterruptedException
	{
		HomePage home_obj =new HomePage(driver);
		ProductSearchPage ProductSearch_obj= new ProductSearchPage(driver);
		home_obj.EnterProductNameInto_TextField("fastrack");
		ProductSearch_obj.clickOnProduct_Link();
		ProductSearch_obj.windowHandling();
		Thread.sleep(10);
		ProductSearch_obj.clickAddToCard_Link();
		logger.info("clickon Add to card");
		
		
		
	}
	@Test(enabled=false)
	public void buyProductFunctionality() throws InterruptedException
	{
		HomePage home_obj =new HomePage(driver);
		ProductSearchPage ProductSearch_obj= new ProductSearchPage(driver);
		home_obj.EnterProductNameInto_TextField("fastrack");
		ProductSearch_obj.clickOnProduct_Link();
		ProductSearch_obj.windowHandling();
		Thread.sleep(10);
		ProductSearch_obj.clickBuyNow_Link();		
		
		
	}

}
