package com.vtiger.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

public class CommonActions {
	
	
private WebDriver driver;
private WebDriverWait wait;
public ExtentTest logger;
	
	public CommonActions(WebDriver driver,ExtentTest logger)
	{
		this.driver = driver;	
		this.logger = logger;
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	}
	
	
	public void enterValue(WebElement elm, String value,String msg)
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOf(elm));
			elm.clear();
			elm.sendKeys(value);
			logger.pass(msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.fail("Step failed due to error "+e.getMessage());
		}
	}
	
	public void clickElement(WebElement elm,String msg)
	{
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(elm));
			elm.click();
			logger.pass(msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.fail("Step failed due to error "+e.getMessage());
		}
	}
	
	public void ElementExist(WebElement elm,String msg)
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOf(elm));
			elm.isDisplayed();
			logger.pass(msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.fail("Step failed due to error "+e.getMessage());
		}
	}

}
