package com.markets.automated.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HomePage {
  WebDriver driver;
  Actions mouseActions;
  
  public HomePage() {
	  
  }
  
  public void NavigateToHomePage(String url) {
	  driver = new ChromeDriver();
	  mouseActions = new Actions(driver);
	  driver.manage().timeouts().pageLoadTimeout(HomePageVariables.PAGE_TIMEOUT);
	  driver.get(url);
  }
  
  public void NavigateToPlatformPage(){
	  driver.findElement(HomePageVariables.promptAcceptAllCookies).click();
	  
	  mouseActions.moveToElement(driver.findElement(HomePageVariables.menuTrading)).perform();
	  
	  driver.findElement(HomePageVariables.submenuPlatform).click();
  }
  
  public void HomePageQuit() {
	  driver.close();
	  driver.quit();
  }
}
