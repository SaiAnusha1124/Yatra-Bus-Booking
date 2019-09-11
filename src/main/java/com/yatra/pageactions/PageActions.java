package com.yatra.pageactions;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class PageActions {

	public static void selectDropdown(WebDriver driver, String xpath, String visibleText) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select noOfpeople = new Select(element);
		noOfpeople.selectByVisibleText(visibleText);

	}

	public static void clickOnElement(WebDriver driver, String xpath) {
		driver.findElement(By.xpath(xpath)).click();

	}

	public static void sendKeys(WebDriver driver, String xpath, String value) {
		driver.findElement(By.xpath(xpath)).sendKeys(value);

	}

	public static void performActionEnter(WebDriver driver) {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
	}

	public static void scrollDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(100, document.body.scrollHeight)");
	}

	public static void ClickElement(WebDriver driver, final String xpath) {
		@SuppressWarnings("deprecation")
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).pollingEvery(1, TimeUnit.SECONDS)
				.withTimeout(30, TimeUnit.SECONDS).ignoring(ElementNotInteractableException.class);
		wait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				driver.findElement(By.xpath(xpath)).click();
				return true;
			}
		});
	}
}
