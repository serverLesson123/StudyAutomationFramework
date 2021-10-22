package com.stormnet.tests.functionalities1;

import com.stormnet.tests.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleTest extends AbstractTest {

	@Test(testName = "First test")
	public void testSum() {
		driver.get("https://google.by");

		String windowTitle = driver.getTitle();
		Assert.assertEquals(windowTitle, "Google", "Unexpected window title");
	}

}
