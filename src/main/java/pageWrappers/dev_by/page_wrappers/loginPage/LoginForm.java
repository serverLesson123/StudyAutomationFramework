package pageWrappers.dev_by.page_wrappers.loginPage;

import common.elements.Button;
import common.elements.Input;
import org.openqa.selenium.By;
import pageWrappers.dev_by.AbstractPage;

public class LoginForm extends AbstractPage {
	private static final By USERNAME_FIELD_LOCATOR = By.id("email");
	private static final By PASSWORD_FIELD_LOCATOR = By.id("password");
	private static final By SIGN_IN_BUTTON_LOCATOR = By.xpath("//div[@data-name=\"login_submit\"]/button");

	public static Input getUserNameField() {
		return new Input(USERNAME_FIELD_LOCATOR);
	}

	public static Input getPasswordsField() {
		return new Input(PASSWORD_FIELD_LOCATOR);
	}

	public static Button getSignInButton() {
		return new Button(SIGN_IN_BUTTON_LOCATOR);
	}

}
