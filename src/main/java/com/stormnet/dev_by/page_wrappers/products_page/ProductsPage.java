package com.stormnet.dev_by.page_wrappers.products_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage {
	protected HeaderPanel headerPanel;
	protected GoodsArea goodsArea;
	private WebDriver driver;
	private static final By MAIN_TAB_BUTTON_LOCATOR = By.xpath("//h2[@data-tab=\"main_listing_tab\"]");

	public ProductsPage(WebDriver driver) {
		this.headerPanel = new HeaderPanel(driver);
		this.goodsArea = new GoodsArea(driver);
		this.driver = driver;
	}

	public HeaderPanel getHeaderPanel() {
		return headerPanel;
	}

	public void waitUntilOpened() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.withMessage("Page was not opened")
				.until(ExpectedConditions.visibilityOfElementLocated(MAIN_TAB_BUTTON_LOCATOR));
	}
}
