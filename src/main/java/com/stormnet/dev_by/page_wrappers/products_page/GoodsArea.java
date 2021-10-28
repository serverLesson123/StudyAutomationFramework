package com.stormnet.dev_by.page_wrappers.products_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.stream.Collectors;

public class GoodsArea {
	private static final By GOOD_LOCATOR = By.className("kf-pnaT-8beb7");
	public final WebDriver driver;
	private List<GoodWithDetailsWrapper> goodsList;

	GoodsArea(WebDriver driver) {
		this.driver = driver;
	}

	public List<GoodWithDetailsWrapper> getGoodsList() {
		goodsList = driver.findElements(GOOD_LOCATOR)
				.stream()
				.map(GoodWithDetailsWrapper::new)
				.collect(Collectors.toList());
		return goodsList;
	}
}
