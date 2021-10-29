package pageWrappers.dev_by.page_wrappers.products_page;

import common.driver.UiDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.stream.Collectors;

public class GoodsArea {
	private static final By GOOD_LOCATOR = By.className("kf-pnaT-8beb7");
	private List<GoodWithDetailsWrapper> goodsList;

	public List<GoodWithDetailsWrapper> getGoodsList() {
		goodsList = UiDriver.getDriver().findElements(GOOD_LOCATOR)
				.stream()
				.map(GoodWithDetailsWrapper::new)
				.collect(Collectors.toList());
		return goodsList;
	}
}
