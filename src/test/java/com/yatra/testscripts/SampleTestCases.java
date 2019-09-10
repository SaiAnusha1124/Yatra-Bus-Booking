package com.yatra.testscripts;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.yatra.testbase.TestBase;
import com.yatra.utils.LogReports;

public class SampleTestCases extends TestBase {
	LogReports log = new LogReports();
	Properties properties;
	//WebDriver driver;
	@Test(priority=1)
	public void sampletestcases() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id=\"booking_engine_buses\"]")).click();
		driver.findElement(By.xpath("//input[@name='bus_leaving']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@name='bus_dest']")).sendKeys("Banglore");
	}

}
