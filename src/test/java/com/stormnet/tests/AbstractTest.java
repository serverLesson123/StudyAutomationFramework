package com.stormnet.tests;

import com.stormnet.listeners.CustomITestNgListener;
import common.driver.UiDriver;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.io.ByteArrayInputStream;

@Listeners({CustomITestNgListener.class})
public class AbstractTest {

	@BeforeMethod
	public void setup() {
		UiDriver.getDriver();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (!result.isSuccess()) {
			Allure.attachment("attachment2.png", new ByteArrayInputStream(takeScreenshot()));
		}
		UiDriver.closeDriver();
	}

	public byte[] takeScreenshot() {
		return ((TakesScreenshot) UiDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
	}

}
