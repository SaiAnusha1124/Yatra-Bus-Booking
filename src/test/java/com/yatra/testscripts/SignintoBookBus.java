package com.yatra.testscripts;

import org.testng.annotations.Test;

import com.yatra.pageactions.PageActions;

public class SignintoBookBus extends BookaBus {
	@Test(priority = 4)
	public void signingToBookTicket() {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		xpath = properties.getProperty("clickEmailAddress");
		PageActions.clickOnElement(driver, xpath);
		PageActions.sendKeys(driver, xpath, "saianusha.p7@gmail.com");
		PageActions.performActionEnter(driver);
		
		xpath = properties.getProperty("enterPhoneNumber");
		PageActions.clickOnElement(driver, xpath);
		PageActions.sendKeys(driver, xpath, "6301657207");
		PageActions.performActionEnter(driver);
		
		xpath = properties.getProperty("clickBookasGuest");
		PageActions.clickOnElement(driver, xpath);
	}

}
