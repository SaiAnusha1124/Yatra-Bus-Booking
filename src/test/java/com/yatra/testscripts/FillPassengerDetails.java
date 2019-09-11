package com.yatra.testscripts;

import org.testng.annotations.Test;

import com.yatra.pageactions.PageActions;

public class FillPassengerDetails extends SignintoBookBus {
	@Test(priority = 5)
	public void fillingTravellerDetails() {
		xpath = properties.getProperty("clickFirstPassengerTitle");
		PageActions.clickOnElement(driver, xpath);
		PageActions.sendKeys(driver, xpath, "Mr");
		PageActions.performActionEnter(driver);


		xpath = properties.getProperty("enterFPName");
		PageActions.clickOnElement(driver, xpath);
		PageActions.sendKeys(driver, xpath, "Bunny");
		PageActions.performActionEnter(driver);

		xpath = properties.getProperty("clickFPAge");
		PageActions.clickOnElement(driver, xpath);
		PageActions.sendKeys(driver, xpath, "20");
		PageActions.performActionEnter(driver);

		xpath = properties.getProperty("clickSeconfPassengerTitle");
		PageActions.clickOnElement(driver, xpath);
		PageActions.sendKeys(driver, xpath, "Mr");
		PageActions.performActionEnter(driver);

		xpath = properties.getProperty("enterSPName");
		PageActions.clickOnElement(driver, xpath);
		PageActions.sendKeys(driver, xpath, "Pavan");
		PageActions.performActionEnter(driver);

		xpath = properties.getProperty("clickSPAge");
		PageActions.clickOnElement(driver, xpath);
		PageActions.sendKeys(driver, xpath, "20");
		PageActions.performActionEnter(driver);

		xpath = properties.getProperty("clickThirdPassengerTitle");
		PageActions.clickOnElement(driver, xpath);
		PageActions.sendKeys(driver, xpath, "Mrs");
		PageActions.performActionEnter(driver);

		xpath = properties.getProperty("enterTPName");
		PageActions.clickOnElement(driver, xpath);
		PageActions.sendKeys(driver, xpath, "Anu");
		PageActions.performActionEnter(driver);

		xpath = properties.getProperty("clickTPAge");
		PageActions.clickOnElement(driver, xpath);
		PageActions.sendKeys(driver, xpath, "22");
		PageActions.performActionEnter(driver);
		
		xpath = properties.getProperty("continueToPaymentPage");
		PageActions.clickOnElement(driver, xpath);

	}

}
