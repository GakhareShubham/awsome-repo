package com.amazon.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.testBase.TestBase;

public class UtilPage extends TestBase {


public UtilPage()
{
	this.driver= driver;
	PageFactory.initElements(driver, this);
}


public String getPageName()
{
String title =driver.getTitle();	
return title;
}

public static void TakeSSS(String filename)
{
	String path ="C:\\Users\\SG\\eclipse-workspace\\new-youtube\\AmazoneProjectTesting\\ScreenshotFile\\";
	
	try {

		TakesScreenshot ts = (TakesScreenshot)driver; 
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dsc = new File(path+filename+".png");
		FileHandler.copy(src, dsc);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}



}