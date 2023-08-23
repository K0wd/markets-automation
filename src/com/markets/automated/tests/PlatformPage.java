package com.markets.automated.tests;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PlatformPage {
  WebDriver driver;
  Actions kbActions;
  ArrayList<String> tabs;
  
  public PlatformPage() {
	  
  }
  
  public void RegisterNewAccount() throws InterruptedException {
	Element(PlatformPageVariables.buttonTryItNow).click();
	
	tabs = new ArrayList<String> (driver.getWindowHandles());
	
    driver.switchTo().window(tabs.get(1));
    
    Element(PlatformPageVariables.textboxEmail).sendKeys("test_account21@test.com");
    Element(PlatformPageVariables.textboxPassword).sendKeys("Test123!");
    
    Element(PlatformPageVariables.buttonSubmit).click();
  }
  
  public void StartOnboardingProcess() throws InterruptedException {
	  	Element(PlatformPageVariables.openCountrySelector).click();
	  	
	  	WebElement currentElement = driver.switchTo().activeElement();
	  	
	  	Thread.sleep(5000);
	  	
	  	currentElement.sendKeys("France" + Keys.DOWN + Keys.ENTER);
	  	
	  	Element(PlatformPageVariables.buttonSaveCountry).click();
	  	// Cypress can deal with NotInteractableException error
	  	// Element(PlatformPageVariables.selectorCountry).sendKeys("France" + Keys.DOWN + Keys.ENTER);
	    Thread.sleep(5000);
	    Element(PlatformPageVariables.fieldTradingExperience).click();
	    Element(PlatformPageVariables.fieldTradingFrequency).click();
	    Element(PlatformPageVariables.dropdownCurrentLanguage).click();
	    Element(PlatformPageVariables.languageFrance).click();
  }
  
  private WebElement Element(By element) throws InterruptedException {
	  Thread.sleep(3000);
	  return driver.findElement(element);
  }
  
  public void PlatformPageQuit() {
	  driver.close();
	  driver.quit();
  }
}
