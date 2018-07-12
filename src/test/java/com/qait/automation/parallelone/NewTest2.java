package com.qait.automation.parallelone;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest2 {
	Superclass s;
	//subclass1 s1;
	//subclass2 s2;
	WebDriver driver;
	
	
	
	@BeforeClass
	public void before() throws IOException
	{
		driver=new ChromeDriver();
		driver.get("https://hris.qainfotech.com/login.php");
		s=new Superclass(driver);
	}
	
	@Test
	public void testinvalidlogin() throws IOException
	{
		Superclass s2=new subclass2(driver);
		String url=s2.invalidlogin();
		Assert.assertNotEquals(url,"https://hris.qainfotech.com:8086/time/timesheet");
	}
	
	
}
