package com.qait.automation.parallelone;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class subclass2 extends Superclass{

	public subclass2(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public String invalidlogin()
    {
    	getuserentry().clear();
    	getuserentry().sendKeys(readinvaliduser());
    	getpasswordentry().clear();
    	getpasswordentry().sendKeys(readinvalidpass());
    	getpasswordentry().submit();
    	String url=driver.getCurrentUrl();
    	return url;
    	
    }

}
