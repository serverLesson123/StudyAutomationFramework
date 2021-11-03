package com.stormnet.tests.functionalities1;

import com.stormnet.tests.AbstractTest;
import common.driver.UiDriver;
import common.driver.UiDriverHelper;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleTest2 extends AbstractTest {

	@Test(description = "Second test")
	public void testSum() {
		UiDriver.getDriver().get("https://dev.by");

		String windowTitle = UiDriverHelper.getTitle();
		Assert.assertEquals(windowTitle, "dev.by", "Unexpected window title");
	}

}
