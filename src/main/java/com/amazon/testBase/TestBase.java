package com.amazon.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Logger logger;

	@BeforeTest
	public void start() {
		logger = logger.getLogger("amazon Fromework");
		PropertyConfigurator.configure("Log4jFile.properties");
		logger.info("Framewor Execution Started");

	}

	@AfterMethod
	public void finish() {
		logger.info("Framework Execution Finished");
		
	}

	@BeforeMethod
	public void setUp() {
		String br = "firefox";
		if(br.equalsIgnoreCase("chrome"))
		{
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			logger.info("Select chrome Browser");	
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			logger.info("Select Firefox Browser");	
		} 
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			logger.info("Select edge Browser");	
		} 
		else 
		{
		logger.info("Select valid Browser");	
		} 
		
		driver.get("https://www.amazon.in/");
		logger.info("launch Url");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		logger.info("close browser");
		logger.info("=============================================");
	}
}
