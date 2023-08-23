package com.markets.automated.tests;

import java.time.Duration;
import org.openqa.selenium.By;

public class PlatformPageVariables {
  static String EXPECTED_URL = "https://www.markets.com/global-en/trade/platform/";
  static String EXPECTED_REGISTRATION_URL = "https://live-trader.markets.com/account-creation/f";
  
  static By buttonTryItNow = By.xpath("//*[@data-cro='trade_it_now']");
  
  static By textboxEmail = By.id("email");
  static By textboxPassword = By.id("regFormPassword");
  static By buttonSubmit = By.xpath("//*[@data-cro='reg_continue']");
  
  
  static By openCountrySelector = By.xpath("//*[@data-action='openCountrySelector']");
  static By selectorCountry = By.xpath("//*[@data-action='duplicateToNationality']");

  static By buttonSaveCountry = By.xpath("//*[@data-action='saveCountry']");
  
  static By fieldTradingExperience = By.xpath("//*[@data-cro='tk_related_role_feb2022_label']"); 
  static By dropdownCurrentLanguage = By.xpath("/html/body/header/div/div/div/div/div/div[4]/div[1]"); 
  static By languageFrance = By.xpath("/html/body/header/div/div/div/div/div/div[4]/div[1]/div[5]/div[2]/div[6]");
  
  static By fieldTradingFrequency = By.xpath("//*[@data-cro='tf_daily_feb2022_label']");
  
  static By assertQuestionHeader = By.xpath("/html/body/div[1]/div[1]/div/section/article/div/div/div[4]/div/div/div[1]/div[2]/div/div/div/div[1]/h3/span/span");
}
