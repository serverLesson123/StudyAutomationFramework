package com.stormnet.tests.dev_by;

import com.stormnet.tests.AbstractTest;
import common.driver.UiDriver;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageWrappers.dev_by.page_wrappers.loginPage.LoginFormHelper;
import pageWrappers.dev_by.page_wrappers.products_page.ProductsPageHelper;

public class LoginTest extends AbstractTest {

	@BeforeMethod
	public void openPage() {
		UiDriver.getDriver().get("https://www.kufar.by/l/r~minsk");
	}

	@Test(testName = "Login with right credentials")
	@Story("LG_12")
	public void loginTestRightCredentials() {

		ProductsPageHelper.openLoginForm();

		LoginFormHelper.fillUsername("p.a.chechetkin@gmail.com");
		LoginFormHelper.fillPassword("agentbars0007");
		LoginFormHelper.submitForm();

		ProductsPageHelper.waitUntilOpened();
	}
}
