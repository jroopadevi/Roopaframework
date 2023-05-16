package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.utilities.CommonActions;

public class LeadPage {

	private WebDriver driver;
	private CommonActions actions;
	public ExtentTest logger;
		
		public LeadPage(WebDriver driver,ExtentTest logger)
		{
			this.driver = driver;
			this.logger=logger;
			PageFactory.initElements(driver, this);
			actions = new CommonActions(driver,logger);
		}
		@FindBy(linkText="New Lead")
		WebElement NewLead;
		
		@FindBy(name="lastname")
		WebElement lastname;
		
		@FindBy(name="company")
		WebElement company;
		
		@FindBy(name="button")
		WebElement save;
		
		
		public void CreateLead(String lname, String comp)
		{
			actions.clickElement(NewLead, "link new lead clicked");
			actions.enterValue(lastname, lname, lname+" has been entered into lastname field");
			actions.enterValue(company, comp, comp+" has been entered into comapny field");
			actions.clickElement(save, "save button clicked");
		}
		
	
}
