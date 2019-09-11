package com.yatra.testscripts;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.yatra.testbase.TestBase;
import com.yatra.utils.LogReports;

public class SampleTestCases extends TestBase {
	LogReports log = new LogReports();
	Properties properties;
	String xpath;
	String sendKeys;

	// WebDriver driver;
	@Test(priority = 1)
	public void sampletestcases() throws Exception {
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//a[@id=\"booking_engine_buses\"]")).click();
		driver.findElement(By.xpath("//input[@name='bus_leaving']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='bus_leaving']")).sendKeys("Hyderabad");
		Thread.sleep(3000);
		action.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='bus_dest']")).click();
		driver.findElement(By.xpath("//input[@name='bus_dest']")).sendKeys("Bangalore");
		Thread.sleep(3000);
		action.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@class='custom-date-input BE_bus_depart_date']")).click();
		driver.findElement(By.xpath("//td[@id='26/09/2019']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='js_ripple search-btn']")).click();
		driver.findElement(By.xpath("//span[@analytics='send,event,Bus SRP,Filter-Bus Type,Seater']")).click();
		driver.findElement(By.xpath("//span[@analytics='send,event,Bus SRP,Filter-Bus Type,Semi-Seater']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class='ngtemp template nocustomselect']")).click();
		WebElement element = driver.findElement(By.xpath("//select[@class='ngtemp template nocustomselect']"));
		Select s = new Select(element);
		s.selectByValue("3");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//ul/li/a[@class='anim sorting-link eventTrackable'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@data-contentcss='details-model seat-map-model'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[@data-type='onwards'])[6]")).click();
		driver.findElement(By.xpath("(//p[@data-type='onwards'])[12]")).click();
		driver.findElement(By.xpath("(//p[@data-type='onwards'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='sprite ddArrow']")).click();
		driver.findElement(By.xpath("(//span[@class='ddlabel'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@analytics='send,event,Seat Selection Pop-up,Seat Selection,Continue']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='gst-btn gst-btn-red w50-fl']")).click();
		driver.findElement(By.xpath("(//input[@class='w240 ie6Input required_field'])[1]")).click();
		driver.findElement(By.xpath("(//input[@class='w240 ie6Input required_field'])[1]"))
				.sendKeys("saianusha.p7@gmail.com");
		driver.findElement(By.xpath("//input[@class='w180 ie6Input required_field']")).click();
		driver.findElement(By.xpath("//input[@class='w180 ie6Input required_field']")).sendKeys("6301657207");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Book as Guest']")).click();
		driver.findElement(By.xpath("(//select[@value='title'])[1]")).click();
		driver.findElement(By.xpath("(//select[@value='title'])[1]")).sendKeys("Mr");
		driver.findElement(By.xpath("(//input[@data-regtype='validName'])[1]")).click();
		driver.findElement(By.xpath("(//input[@data-regtype='validName'])[1]")).sendKeys("Bunny");
		driver.findElement(By.xpath("(//select[@data-errormsg='Please select age.'])[1]")).click();
		driver.findElement(By.xpath("(//select[@data-errormsg='Please select age.'])[1]")).sendKeys("20");
		
		
		driver.findElement(By.xpath("(//select[@value='title'])[1]")).click();
		driver.findElement(By.xpath("(//select[@value='title'])[1]")).sendKeys("Mr");
		driver.findElement(By.xpath("(//input[@data-regtype='validName'])[1]")).click();
		driver.findElement(By.xpath("(//input[@data-regtype='validName'])[1]")).sendKeys("Bunny");
		driver.findElement(By.xpath("(//select[@data-errormsg='Please select age.'])[1]")).click();
		driver.findElement(By.xpath("(//select[@data-errormsg='Please select age.'])[1]")).sendKeys("20");

	}
}
