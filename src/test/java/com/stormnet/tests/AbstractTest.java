package com.stormnet.tests;

import com.stormnet.listeners.CustomITestNgListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.io.ByteArrayInputStream;

@Listeners({CustomITestNgListener.class, AllureTestNg.class})
public class AbstractTest {
	protected WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		this.driver = driver;
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (!result.isSuccess()) {
			Allure.attachment("attachment2.png", new ByteArrayInputStream(takeScreenshot()));
		}
		driver.close();
	}

	public byte[] takeScreenshot() {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

}
