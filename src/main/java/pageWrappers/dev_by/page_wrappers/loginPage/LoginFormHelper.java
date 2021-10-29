package pageWrappers.dev_by.page_wrappers.loginPage;

import pageWrappers.dev_by.page_wrappers.products_page.ProductsPageHelper;

public class LoginFormHelper {

	public static void fillUsername(String username) {
		LoginForm.getUserNameField().sendKeys(username);
	}

	public static void fillPassword(String password) {
		LoginForm.getPasswordsField().sendKeys(password);
	}

	public static void submitForm() {
		LoginForm.getSignInButton().click();
	}

	public static void loginWithCreds(String userName, String password) {
		fillUsername(userName);
		fillPassword(password);
		submitForm();

		ProductsPageHelper.waitUntilOpened();
	}
}
