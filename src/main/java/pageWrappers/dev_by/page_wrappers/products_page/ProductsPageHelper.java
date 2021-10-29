package pageWrappers.dev_by.page_wrappers.products_page;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageWrappers.dev_by.page_wrappers.loginPage.LoginForm;

import java.time.Duration;

import static common.driver.UiDriver.getDriver;


public class ProductsPageHelper {

	public static void waitUntilOpened() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
		wait.withMessage("Page was not opened")
				.until(ExpectedConditions.visibilityOfElementLocated(ProductsPage.MAIN_TAB_BUTTON_LOCATOR));
	}

	public static void openLoginForm() {
		ProductsPage.HeaderPanel.getOpenLoginFormButton().click();
		new WebDriverWait(getDriver(), Duration.ofSeconds(2))
				.withMessage("")
				.until(ExpectedConditions.visibilityOfElementLocated(LoginForm.getUserNameField().getLocator()));
	}
}
