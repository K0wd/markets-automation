package com.markets.automated.tests;

import java.time.Duration;
import org.openqa.selenium.By;

public class HomePageVariables {
  static String BASE_URL = "https://www.markets.com/";
  
  static Duration PAGE_TIMEOUT = Duration.ofSeconds(20);
  
  static By promptAcceptAllCookies = By.xpath("//*[@data-action='acceptAllCookies']");

  static By menuTrading = By.xpath("(//*[@data-action='mobileMenuDropdown'])[2]");
  
  static By submenuPlatform = By.xpath("//*[@aria-label='Platform']");
}
