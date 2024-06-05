package com.amazon.pageLayer;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.testBase.TestBase;

public class ProductSearchPage extends TestBase {
	private WebDriver driver;

	public ProductSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]")
	private WebElement select_product;
	@FindBy(xpath = "(//input[@id='add-to-cart-button'])[2]")
	private WebElement addtocard;
	@FindBy(xpath = "//input[@id='buy-now-button']")
	private WebElement buy_now;
	
	
	public void clickOnProduct_Link() {
		select_product.click();

	}

	public void windowHandling() {
//		String Parent_Id = driver.getWindowHandle();
//		Set<String> All_ids = driver.getWindowHandles();
//		System.out.println(Parent_Id);
//		System.out.println(All_ids);
//		driver.switchTo().Window("d9aceeda-be55-450f-9615-0111b7c4036b");
//		logger.info("Switch to windows");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL);
		act.sendKeys(Keys.PAGE_DOWN);

	}
	
	public void clickAddToCard_Link() {
		addtocard.click();
		logger.info("clickon Add to card");

	}
	
	public void clickBuyNow_Link() {
		buy_now.click();
	}
}
