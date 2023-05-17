package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.utilities.CommonActions;

public class AccountPage {
	private WebDriver driver;
	private CommonActions actions;
	public ExtentTest logger;
		
		public AccountPage(WebDriver driver,ExtentTest logger)
		{
			this.driver = driver;
			this.logger=logger;
			PageFactory.initElements(driver, this);
			actions = new CommonActions(driver,logger);
		}
}
