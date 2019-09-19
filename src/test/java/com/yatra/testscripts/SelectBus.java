package com.yatra.testscripts;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.yatra.pageactions.PageActions;

public class SelectBus extends SearchForBus {
	@Test(priority = 2)
	public void selecting_Bus() throws Exception {
		/*
		 * Selecting bustype, no.of passengers Selecting one bus as per requirements
		 */
		PageActions.clickOnElement(driver, properties.getProperty("busTypeSeater"));
		PageActions.clickOnElement(driver, properties.getProperty("busTypeSemiseater"));
		PageActions.clickOnElement(driver, properties.getProperty("busTypeNonAC"));
		PageActions.clickOnElement(driver, properties.getProperty("clickNo.ofPassengers"));
		PageActions.sendKeys(driver, properties.getProperty("clickNo.ofPassengers"), "3");
		PageActions.sendKeys(Keys.ENTER);
		PageActions.clickOnElement(driver, properties.getProperty("clickDuration"));
		PageActions.clickOnElement(driver, properties.getProperty("selectBuses"));
		log.info("Selected bus as per requirements");
	}
}
