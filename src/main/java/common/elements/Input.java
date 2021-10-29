package common.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input extends HtmlElement{

	public Input(WebDriver driver, By locator) {
		super(driver, locator);
	}

	public void sendKeys(String text){
		getElement().clear();
		getElement().sendKeys(text);
	}
}
