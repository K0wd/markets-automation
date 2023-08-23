package com.markets.automated.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class HomePageTests {
	HomePage objHomePage;
	
	
	@Test
	public void testNavigationToPlatformPage() {
		objHomePage.NavigateToPlatformPage();
		
		assertEquals(objHomePage.driver.getCurrentUrl(), PlatformPageVariables.EXPECTED_URL);
	}
  
    @BeforeTest
    public void setup(){
	    objHomePage = new HomePage();
  
	    objHomePage.NavigateToHomePage(HomePageVariables.BASE_URL);
    }
  
    @AfterTest
    public void teardown() {
	    objHomePage.HomePageQuit();
    }
}
