package com.amazon.pageLayer;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	private WebDriver driver;

	public SignInPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement username_textfield;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continue_btn;
		
	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement password_textfield;
	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement sign_btn;
	
	public void enterUsername_textField(String uname) {
		username_textfield.sendKeys(uname);;

	}

	public void clickOnContinue_Button() {
		continue_btn.click();

	}
	public void enterPassword_TextField(String pass) {
		password_textfield.sendKeys(pass);
		sign_btn.click();
	}
	
}
