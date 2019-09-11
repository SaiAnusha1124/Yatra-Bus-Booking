package com.yatra.testscripts;

import java.util.Properties;
import org.testng.annotations.Test;

import com.yatra.pageactions.PageActions;
import com.yatra.testbase.TestBase;
import com.yatra.utils.ConstantsFilePaths;
import com.yatra.utils.LogReports;
import com.yatra.utils.ReadLocatorsFile;

public class SearchForBus extends TestBase {
	LogReports log = new LogReports();
	Properties properties;
	// WebDriver driver;
	String xpath;
	String sendKeys;

	@Test(priority = 1)
	public void searching_Bus() throws Exception {
		properties = ReadLocatorsFile.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
		xpath = properties.getProperty("clickBuses");
		PageActions.clickOnElement(driver, xpath);

		xpath = properties.getProperty("clickFromPlace");
		PageActions.clickOnElement(driver, xpath);
		Thread.sleep(3000);
		PageActions.sendKeys(driver, xpath, "Hyderabad");
		Thread.sleep(3000);
		PageActions.performActionEnter(driver);

		xpath = properties.getProperty("clickToPlace");
		PageActions.clickOnElement(driver, xpath);
		Thread.sleep(3000);
		PageActions.sendKeys(driver, xpath, "Bangalore");
		Thread.sleep(3000);
		PageActions.performActionEnter(driver);

		xpath = properties.getProperty("clickDate");
		PageActions.clickOnElement(driver, xpath);
		xpath = properties.getProperty("clickDateValue");
		PageActions.clickOnElement(driver, xpath);

		Thread.sleep(2000);
		xpath = properties.getProperty("clickSearchBuses");
		PageActions.clickOnElement(driver, xpath);
	}
}
