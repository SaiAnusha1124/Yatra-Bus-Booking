package com.yatra.testscripts;

import org.testng.annotations.Test;
import com.yatra.pageactions.PageActions;

public class BookaBus extends SelectBus
{
	@Test(priority=3)
	public void booking_Bus()
	{
		xpath = properties.getProperty("clickFirstBusSeat");
		PageActions.clickOnElement(driver, xpath);
		
		xpath = properties.getProperty("clickSecondBusSeat");
		PageActions.clickOnElement(driver, xpath);
		
		xpath = properties.getProperty("clickThirdBusSeat");
		PageActions.clickOnElement(driver, xpath);
		
		xpath = properties.getProperty("clickBordingPoint");
		PageActions.clickOnElement(driver, xpath);
		
		xpath = properties.getProperty("clickBordingPointAddress");
		PageActions.clickOnElement(driver, xpath);
		
		xpath = properties.getProperty("clickContinue");
		PageActions.clickOnElement(driver, xpath);
	}
}
