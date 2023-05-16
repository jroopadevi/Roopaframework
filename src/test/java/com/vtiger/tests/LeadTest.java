package com.vtiger.tests;

import org.testng.annotations.Test;

import com.vtiger.pages.HomePage;
import com.vtiger.pages.LeadPage;
import com.vtiger.pages.LoginPage;

public class LeadTest extends  BaseTest {
	@Test
	public void InvalidLoginTC04()
	{
		String TCName = "InvalidLoginTC04";
        logger = extent.createTest(TCName);
		LoginPage lp = new LoginPage(driver,logger);
		lp.Login("admin", "admin");
		LeadPage lep = new LeadPage(driver,logger);
		lep.CreateLead("Naidu","Infosys");
		HomePage hp = new HomePage(driver,logger);	
		hp.clickLogout();		
		extent.flush();
		
	}

}

