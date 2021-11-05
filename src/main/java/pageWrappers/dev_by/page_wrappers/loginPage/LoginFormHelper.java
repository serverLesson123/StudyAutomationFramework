package pageWrappers.dev_by.page_wrappers.loginPage;

import io.qameta.allure.Step;

import org.slf4j.LoggerFactory;
import pageWrappers.dev_by.page_wrappers.products_page.ProductsPageHelper;
import utility.logerator.Logger;

public class LoginFormHelper {
	

	@Step("Fill username by {0}")
	public static void fillUsername(String username) {
		LoginForm.getUserNameField().sendKeys(username);
	}

	@Step("Fill password")
	public static void fillPassword(String password) {
		LoginForm.getPasswordsField().sendKeys(password);
	}

	@Step("Submit form")
	public static void submitForm() {
		LoginForm.getSignInButton().click();
	}

	@Step("Login to application with {0}/{1}")
	public static void loginWithCreds(String userName, String password) {
		Logger.getLogger().info("Try to login as {}/{}", userName, password);
		fillUsername(userName);
		fillPassword(password);
		submitForm();
		ProductsPageHelper.waitUntilOpened();
		Logger.getLogger().info("Logged in as {}/{}", userName, password);
	}
}
