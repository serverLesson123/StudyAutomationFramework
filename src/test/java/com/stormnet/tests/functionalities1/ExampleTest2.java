package com.stormnet.tests.functionalities1;

import com.stormnet.tests.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleTest2 extends AbstractTest {

	@Test(testName = "Second test")
	public void testSum() {
		driver.get("https://dev.by");

		String windowTitle = driver.getTitle();
		Assert.assertEquals(windowTitle, "dev.by", "Unexpected window title");
	}

}
