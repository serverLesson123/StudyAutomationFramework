package com.stormnet.dev_by.page_wrappers.loginPage;

import com.stormnet.dev_by.AbstractPage;
import com.stormnet.dev_by.page_wrappers.products_page.ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginForm extends AbstractPage {
	private static final By USERNAME_FIELD_LOCATOR = By.id("email");
	private static final By PASSWORD_FIELD_LOCATOR = By.id("password");
	private static final By SIGN_IN_BUTTON_LOCATOR = By.xpath("//div[@data-name=\"login_submit\"]/button");
	private final WebDriver driver;

	public LoginForm(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUserNameField() {
		return driver.findElement(USERNAME_FIELD_LOCATOR);
	}

	public WebElement getPasswordsField() {
		return driver.findElement(PASSWORD_FIELD_LOCATOR);
	}

	public WebElement getSignInButton() {
		return driver.findElement(SIGN_IN_BUTTON_LOCATOR);
	}

	// region Actions
	public LoginForm fillUsername(String username) {
		getUserNameField().sendKeys(username);
		return this;
	}

	public LoginForm fillPassword(String password) {
		getPasswordsField().sendKeys(password);
		return this;
	}

	public ProductsPage submitForm() {
		getSignInButton().click();
		return new ProductsPage(driver);
	}

	public ProductsPage loginWithCreds(String userName, String password) {
		return fillUsername(userName)
				.fillPassword(password)
				.submitForm();
	}
	// endregion
}
