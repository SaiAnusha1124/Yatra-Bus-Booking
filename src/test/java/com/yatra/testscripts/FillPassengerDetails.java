package com.yatra.testscripts;

import org.testng.annotations.Test;
import com.yatra.helpers.ExcelRead;
import com.yatra.pageactions.PageActions;
import com.yatra.utils.LogReports;

public class FillPassengerDetails extends SignintoBookBus {
	LogReports log = new LogReports();

	@Test(priority = 5)
	public void fillingTravellerDetails() throws Exception {
		/*
		 * read and get data from excelsheet
		 */
		String[][] userdata = ExcelRead.getData(".\\src\\test\\resources\\testdata\\inputs-yatrabusbooking.xlsx");
		/*
		 * Entering all passengersdetails
		 */
		PageActions.clickOnElement(driver, properties.getProperty("clickFirstPassengerTitle"));
		PageActions.sendKeys(driver, properties.getProperty("clickFirstPassengerTitle"), "Mr");
		PageActions.performActionEnter(driver, properties.getProperty("clickFirstPassengerTitle"));

		PageActions.clickOnElement(driver, properties.getProperty("enterFPName"));
		PageActions.sendKeys(driver, properties.getProperty("enterFPName"), userdata[1][4]);
		PageActions.performActionEnter(driver, properties.getProperty("enterFPName"));

		PageActions.clickOnElement(driver, properties.getProperty("clickFPAge"));
		PageActions.sendKeys(driver, properties.getProperty("clickFPAge"), "20");
		PageActions.performActionEnter(driver, properties.getProperty("clickFPAge"));

		PageActions.clickOnElement(driver, properties.getProperty("clickSeconfPassengerTitle"));
		PageActions.sendKeys(driver, properties.getProperty("clickSeconfPassengerTitle"), "Mr");
		PageActions.performActionEnter(driver, properties.getProperty("clickSeconfPassengerTitle"));
		PageActions.clickOnElement(driver, properties.getProperty("enterSPName"));
		PageActions.sendKeys(driver, properties.getProperty("enterSPName"), userdata[1][7]);
		PageActions.performActionEnter(driver, properties.getProperty("enterSPName"));

		PageActions.clickOnElement(driver, properties.getProperty("clickSPAge"));
		PageActions.sendKeys(driver, properties.getProperty("clickSPAge"), "20");
		PageActions.performActionEnter(driver, properties.getProperty("clickSPAge"));

		PageActions.clickOnElement(driver, properties.getProperty("clickThirdPassengerTitle"));
		PageActions.sendKeys(driver, properties.getProperty("clickThirdPassengerTitle"), "Mrs");
		PageActions.performActionEnter(driver, properties.getProperty("clickThirdPassengerTitle"));

		PageActions.clickOnElement(driver, properties.getProperty("enterTPName"));
		PageActions.sendKeys(driver, properties.getProperty("enterTPName"), userdata[1][10]);
		PageActions.performActionEnter(driver, properties.getProperty("enterTPName"));

		PageActions.clickOnElement(driver, properties.getProperty("clickTPAge"));
		PageActions.sendKeys(driver, properties.getProperty("clickTPAge"), "22");
		PageActions.performActionEnter(driver, properties.getProperty("clickTPAge"));
		log.info("Entered all passenger details");
		PageActions.clickOnElement(driver, properties.getProperty("continueToPaymentPage"));
		log.info("Sucessfully automated test cases");
		driver.quit();

	}

}
