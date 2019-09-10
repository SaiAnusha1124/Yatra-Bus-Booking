package com.yatra.testscripts;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.yatra.utils.ConstantsFilePaths;
import com.yatra.utils.LogReports;
import com.yatra.utils.ReadLocatorsFile;

public class SearchForBus {
	LogReports log = new LogReports();
	Properties properties;
	WebDriver driver;
	@Test(priority=1)
	public void clickBuses() throws Exception
	{		
		properties=ReadLocatorsFile.loadProperty(ConstantsFilePaths.LOCATORS_FILE);
		String nclickBuses = properties.getProperty("clickBuses");
		String nclickBusesValue=properties.getProperty("clickBusesValue");
		driver.findElement(By.xpath(nclickBuses)).sendKeys(nclickBusesValue);
	}

}
