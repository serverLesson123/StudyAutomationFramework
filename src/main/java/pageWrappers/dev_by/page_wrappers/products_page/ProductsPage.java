package pageWrappers.dev_by.page_wrappers.products_page;

import common.elements.Button;
import org.openqa.selenium.By;

public class ProductsPage {
	static final By MAIN_TAB_BUTTON_LOCATOR = By.xpath("//h2[@data-tab=\"main_listing_tab\"]");

	public static class HeaderPanel {
		private static final By OPEN_LOGIN_FORM_BUTTON_LOCATOR = By.xpath("//div[@data-name=\"login_button\"]/button");

		public static Button getOpenLoginFormButton() {
			return new Button(OPEN_LOGIN_FORM_BUTTON_LOCATOR);
		}
	}
}
