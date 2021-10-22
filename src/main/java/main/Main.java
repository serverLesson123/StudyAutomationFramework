package main;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.by");

		WebElement searchField = driver.findElement(By.name("q"));

		Actions actions = new Actions(driver);
		actions.moveToElement(searchField).perform();


//		Set<String> beforeHandls = driver.getWindowHandles();
//
//		driver.findElement(By.tagName("")).click();
//
//		Set<String> afterHandls = driver.getWindowHandles();
//
//		afterHandls.removeAll(beforeHandls);
//		driver.switchTo().window((String) afterHandls.toArray()[0]);



		searchField.sendKeys("wikipedia");
		searchField.sendKeys(Keys.ENTER);

		driver.navigate().refresh();

		new WebDriverWait(driver, Duration.ofSeconds(4))
				.withMessage("Not serach results")
				.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3")));

		List<WebElement> searchResults = driver.findElements(By.tagName("h3"));
		WebElement firstResult = searchResults.get(0);

//		((JavascriptExecutor) driver).executeScript("arguments[0].click()", firstResult);

		firstResult.click();

		driver.manage().window().maximize();

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		screenshot.renameTo(new File("screenshot.jpg"));

		driver.close();
	}
}
