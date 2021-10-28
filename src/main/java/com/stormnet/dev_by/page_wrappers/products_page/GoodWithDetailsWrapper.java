package com.stormnet.dev_by.page_wrappers.products_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoodWithDetailsWrapper {
	private static final By PRICE_LOCATOR = By.className("kf-pgio-b085c");
	private final WebElement goodParentElement;

	public GoodWithDetailsWrapper(WebElement element) {
		this.goodParentElement = element;
	}

	public WebElement getPriceElement(){
		return goodParentElement.findElement(PRICE_LOCATOR);
	}
}
