package com.qait.automation.parallelone;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Hello world!
 *
 */
public class Superclass 
{
    WebDriver driver;
    Properties p=new Properties();
    FileReader reader;
    
    public Superclass(WebDriver driver) throws IOException
    {
    	this.driver=driver;
    	reader=new FileReader("/home/vijayprakash/eclipse-workspace/parallelone/src/main/java/datafile/db.properties");
    	p.load(reader);
    }
   /* public void readvaliddata()
    {
    	readvaliduser();
    	readvalidpass();
    }
    public void readinvaliddata()
    {
    	readinvaliduser();
    	readinvalidpass();
    }*/
    public WebElement getuserentry()
    {
    	WebElement username=driver.findElement(By.id("txtUserName"));
    	return username;
    }
    
    public WebElement getpasswordentry()
    {
    	WebElement password=driver.findElement(By.id("txtPassword"));
    	return password;
    }
    public String readvaliduser()
    {
    	return(p.getProperty("username"));
    }
    public String readvalidpass()
    {
    	return(p.getProperty("password"));
    }
    public String readinvaliduser()
    {
    	return(p.getProperty("invaliduser"));
    }
    public String  readinvalidpass()
    {
    	return(p.getProperty("invalidpass"));
    }
	public String validlogin() {
		return null;
	}
	public String invalidlogin() {
		return null;
	}
    
    
}
