package com.stormnet.tests.dev_by;

import com.stormnet.dev_by.page_wrappers.products_page.ProductsPage;
import com.stormnet.tests.AbstractTest;
import com.stormnet.dev_by.page_wrappers.loginPage.LoginForm;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class LoginTest extends AbstractTest {

	@Test(testName = "Login with right credentials")
	@Story("LG_12")
	public void loginTestRightCredentials() {
		driver.get("https://www.kufar.by/l/r~minsk");

		ProductsPage productsPage = new ProductsPage(driver);
		productsPage.getHeaderPanel().getOpenLoginFormButton();

		LoginForm loginForm = new LoginForm(driver);
		productsPage = loginForm.fillUsername("p.a.chechetkin@gmail.com")
				.fillPassword("agentbars0007")
				.submitForm();

		productsPage.waitUntilOpened();

	}

}
