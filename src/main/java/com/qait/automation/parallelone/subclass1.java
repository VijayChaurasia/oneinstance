package com.qait.automation.parallelone;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class subclass1 extends Superclass{

	public subclass1(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
    public String validlogin()
    {
    	getuserentry().clear();
    	getuserentry().sendKeys(readvaliduser());
    	getpasswordentry().clear();
    	getpasswordentry().sendKeys(readvalidpass());
    	getpasswordentry().submit();
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	String url=driver.getCurrentUrl();
    	return url;	
    }
	
}
