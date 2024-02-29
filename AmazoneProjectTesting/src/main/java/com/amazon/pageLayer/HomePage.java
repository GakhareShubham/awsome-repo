package com.amazon.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement search_box;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement search_button;
	
	@FindBy(xpath="//a[@class='nav-a nav-a-2   nav-progressive-attribute']")
	private WebElement signIn;
	
	@FindBy(xpath="//Select[contains(@id,'searchDropdownBox')]")
	private WebElement drop_down;
	
	public void EnterProductNameInto_TextField(String content)
	{
		search_box.sendKeys(content);
		search_button.click();
	}
	public void clickOnSignInLink()	{
		signIn.click();
		
	}
	
	public void dropDown() 
	{
	
		WebElement dropdown = driver.findElement(By.xpath("//select[contains(@id,'searchDropdownBox')]"));
		Select s = new Select(dropdown);
		s.selectByIndex(7);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		
	}
	
	
}
