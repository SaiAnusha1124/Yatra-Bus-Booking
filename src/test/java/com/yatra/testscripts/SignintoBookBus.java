package com.yatra.testscripts;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.yatra.helpers.ExcelRead;
import com.yatra.pageactions.PageActions;
import com.yatra.validation.ValidateBusDetails;
import com.yatra.validation.ValidateTime;

public class SignintoBookBus extends BookaBus {
	// String[][] userdata;
	@Test(priority = 4)
	public void signingToBookTicket() throws Exception {
		/*
		 * read and get data from excelsheet
		 */
		String[][] userdata = ExcelRead.getData(".\\src\\test\\resources\\testdata\\inputs-yatrabusbooking.xlsx");
		String phoneNo = userdata[1][2].replace(".", "").replace("E9", "");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ValidateTime.validatingstartingTime();
		ValidateTime.validatingendingTime();
		ValidateBusDetails.validatingBordingPoint();
		ValidateBusDetails.validatingBordingPointAddress();
		PageActions.clickOnElement(driver, properties.getProperty("clickEmailAddress"));
		PageActions.sendKeys(driver, properties.getProperty("clickEmailAddress"), userdata[1][1]);
		PageActions.sendKeys(Keys.ENTER);
		PageActions.clickOnElement(driver, properties.getProperty("enterPhoneNumber"));
		PageActions.sendKeys(driver, properties.getProperty("enterPhoneNumber"), phoneNo);
		PageActions.sendKeys(Keys.ENTER);
		log.info("Entered email and phoneno for corfirmation");
		PageActions.clickOnElement(driver, properties.getProperty("clickBookasGuest"));
	}
}
