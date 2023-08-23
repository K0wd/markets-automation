package com.markets.automated.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class PlatformPageTests {
	HomePage objHomePage;
	PlatformPage objPlatformPage;
	
	
	@Test
	public void testCreationOfNewAccounts() throws InterruptedException {
		objPlatformPage.RegisterNewAccount();
		objPlatformPage.StartOnboardingProcess();
		
		assertEquals(objPlatformPage.driver.findElement(PlatformPageVariables.assertQuestionHeader).getText(), "Objectif et nature de votre trading :");
	}
  
    @BeforeTest
    public void setup(){
	    objHomePage = new HomePage();
	    objPlatformPage = new PlatformPage();
	    
	    objHomePage.NavigateToHomePage(HomePageVariables.BASE_URL);
	    objHomePage.NavigateToPlatformPage();
	    
		objPlatformPage.driver = objHomePage.driver;
    }
  
    @AfterTest
    public void teardown() {
	    objHomePage.HomePageQuit();
    }
}
