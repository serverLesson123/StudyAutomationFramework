package common.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HtmlElement {
	protected By locator;
	protected WebDriver driver;

	public HtmlElement(WebDriver driver, By locator) {
		this.driver = driver;
		this.locator = locator;
	}

	protected WebElement getElement() {
		return driver.findElement(locator);
	}

}
