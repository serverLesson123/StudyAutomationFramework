package common.driver;

import common.elements.HtmlElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.http.HttpClient;
import java.time.Duration;

public class Waiter {
	private int defaultWaitTimeInSeconds = 5;

	public Waiter(int timeout) {
		defaultWaitTimeInSeconds = timeout;
	}

	public Waiter() {
	}

	public void untilVisible(HtmlElement element, String message){
		new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(defaultWaitTimeInSeconds))
				.withMessage(message)
				.until(ExpectedConditions.visibilityOfElementLocated(element.getLocator()));
	}
}
