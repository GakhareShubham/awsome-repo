package com.amazon.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.amazon.testBase.TestBase;

public class ITestListenerPage extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("TestCase Execution started" + result.getName());	
				}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("TestCase Execution sucsses" + result.getName());	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		UtilPage.TakeSSS(result.getName());
		logger.info("TestCase Execution failed" + result.getName());	
	}


	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("TestCase Execution Skipped" + result.getName());	
	}


	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}

}
