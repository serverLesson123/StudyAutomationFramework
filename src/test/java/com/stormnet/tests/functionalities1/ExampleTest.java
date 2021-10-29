package com.stormnet.tests.functionalities1;

import com.stormnet.tests.AbstractTest;
import common.driver.UiDriver;
import common.driver.UiDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageWrappers.dev_by.page_wrappers.loginPage.LoginFormHelper;

public class ExampleTest extends AbstractTest {

	@Test(description = "First test")
	public void testSum() {
		UiDriver.getDriver().get("https://google.by");

		String windowTitle = UiDriverHelper.getTitle();

		LoginFormHelper.loginWithCreds("username", "password");

		Assert.assertEquals(windowTitle, "Google", "Unexpected window title");
	}

}
