package com.vtiger.tests;

import org.testng.annotations.Test;

import com.vtiger.pages.HomePage;
import com.vtiger.pages.LoginPage;

public class LoginTest extends BaseTest {
	
	
	
	
	@Test
	public void InvalidLoginTC01()
	{
		String TCName = "InvalidLoginTC01";
        logger = extent.createTest(TCName);
		LoginPage lp = new LoginPage(driver,logger);
		lp.Login("sadad", "sadad");
		lp.verifyErrorMsg();
		extent.flush();
	}
	
	@Test
	public void validLoginTC02()
	{
		String TCName = "validLoginTC02";
        logger = extent.createTest(TCName);
		LoginPage lp = new LoginPage(driver,logger);
		lp.Login("admin", "admin");
		HomePage hp = new HomePage(driver,logger);	
		hp.clickLogout();		
		extent.flush();
	}
	
	@Test
	public void verifyLogoTC03()
	{
		String TCName = "verifyLogoTC03";
        logger = extent.createTest(TCName);
		LoginPage lp = new LoginPage(driver,logger);
		lp.verifyLogo();
		extent.flush();
	}

}
