package com.yatra.testscripts;

import org.testng.annotations.Test;
import com.yatra.pageactions.PageActions;

public class SelectBus extends SearchForBus {
	@Test(priority = 2)
	public void selecting_Bus() throws Exception {

		xpath = properties.getProperty("busTypeSeater");
		PageActions.clickOnElement(driver, xpath);

		xpath = properties.getProperty("busTypeSemiseater");
		PageActions.clickOnElement(driver, xpath);

		xpath = properties.getProperty("busTypeNonAC");
		PageActions.clickOnElement(driver, xpath);

		xpath = properties.getProperty("clickNo.ofPassengers");
		PageActions.clickOnElement(driver, xpath);
		PageActions.sendKeys(driver, xpath, "3");
		PageActions.performActionEnter(driver);

		xpath = properties.getProperty("clickDuration");
		PageActions.clickOnElement(driver, xpath);

		xpath = properties.getProperty("selectBuses");
		PageActions.clickOnElement(driver, xpath);
	}

}
