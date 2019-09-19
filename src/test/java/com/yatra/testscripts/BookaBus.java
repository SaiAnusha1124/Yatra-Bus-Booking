package com.yatra.testscripts;

import org.testng.annotations.Test;
import com.yatra.pageactions.PageActions;
import com.yatra.validation.ValidateBusDetails;

public class BookaBus extends SelectBus {
	@Test(priority = 3)
	public void booking_Bus() throws Exception {
		/*
		 * selecting seats
		 */
		PageActions.clickOnElement(driver, properties.getProperty("clickFirstBusSeat"));
		PageActions.clickOnElement(driver, properties.getProperty("clickSecondBusSeat"));
		PageActions.clickOnElement(driver, properties.getProperty("clickThirdBusSeat"));
		log.info("Completed seats booking");
		ValidateBusDetails.validatingBusName();
		ValidateBusDetails.validatingBusType();
		PageActions.clickOnElement(driver, properties.getProperty("clickBordingPoint"));
		PageActions.clickOnElement(driver, properties.getProperty("clickBordingPointAddress"));
		log.info("entered bording point");
		ValidateBusDetails.validatingSeatsNumber();
		ValidateBusDetails.validatingTotalFare();
		PageActions.clickOnElement(driver, properties.getProperty("clickContinue"));
		/*
		 * calling method for validate busdetails
		 */
	}
}
