package com.stormnet.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomITestNgListener implements ITestListener {
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test " + result.getTestName() + " was " + result.getStatus());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test " + result.getTestName() + " was " + result.getStatus());
	}

}
