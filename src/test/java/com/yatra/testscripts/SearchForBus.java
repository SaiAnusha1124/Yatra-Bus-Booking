package com.yatra.testscripts;

import java.util.Properties;
import org.testng.annotations.Test;
import com.yatra.pageactions.PageActions;
import com.yatra.testbase.TestBase;
import com.yatra.utils.ConstantsFilePaths;
import com.yatra.utils.LogReports;
import com.yatra.utils.ReadLocatorsFile;
import com.yatra.validation.ValidatePlace_Date;

public class SearchForBus extends TestBase {
	LogReports log = new LogReports();
	Properties properties;
	// WebDriver driver;
	String xpath;
	String sendKeys;

	@Test(priority = 1)
	public void searching_Bus() throws Exception {
		/*
		 * reading locators paths
		 */
		properties = ReadLocatorsFile.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
		PageActions.clickOnElement(driver, properties.getProperty("clickBuses"));
		PageActions.clickOnElement(driver, properties.getProperty("clickFromPlace"));
		Thread.sleep(3000);
		PageActions.sendKeys(driver, properties.getProperty("clickFromPlace"), "Hyderabad");
		Thread.sleep(3000);
		PageActions.performActionEnter(driver,properties.getProperty("clickFromPlace"));
		log.info("Clicked fromplace");
		PageActions.clickOnElement(driver, properties.getProperty("clickToPlace"));
		Thread.sleep(3000);
		PageActions.sendKeys(driver, properties.getProperty("clickToPlace"), "Bangalore");
		Thread.sleep(3000);
		PageActions.performActionEnter(driver,properties.getProperty("clickToPlace"));
		log.info("Clicked toplace");
		PageActions.clickOnElement(driver, properties.getProperty("clickDate"));
		PageActions.clickOnElement(driver, properties.getProperty("clickDateValue"));
		log.info("clicked date");
		PageActions.clickOnElement(driver, properties.getProperty("clickSearchBuses"));
		/*
		 * calling method
		 * for validate the data
		 */
		ValidatePlace_Date.validatingFromPlace();
		ValidatePlace_Date.validatingToPlace();
		ValidatePlace_Date.validatingDateofJourney();
		
	}
}
