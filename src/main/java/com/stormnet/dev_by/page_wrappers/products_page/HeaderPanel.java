package com.stormnet.dev_by.page_wrappers.products_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPanel {
	private static final By OPEN_LOGIN_FORM_BUTTON_LOCATOR = By.xpath("//div[@data-name=\"login_button\"]/button");
	public final WebDriver driver;

	HeaderPanel(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getOpenLoginFormButton() {
		return driver.findElement(OPEN_LOGIN_FORM_BUTTON_LOCATOR);
	}
}
