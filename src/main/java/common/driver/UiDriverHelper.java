package common.driver;


import utility.logerator.Logger;

public class UiDriverHelper {

	public static String getTitle() {
		String title = UiDriver.getDriver().getTitle();
		Logger.getLogger().info("Got title window {}", title);
		return title;
	}
}
