package common.elements;

import org.openqa.selenium.By;

public class Button extends HtmlElement {
	public Button(By locator) {
		super(locator);
	}

	public void click() {
		getElement().click();
	}
}
