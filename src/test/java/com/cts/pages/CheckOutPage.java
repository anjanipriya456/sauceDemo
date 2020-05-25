package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

	private static By clickOnFinishLoc =By.linkText("FINISH");
	  public static void clickOnFinish(WebDriver driver)
	  {
	 driver.findElement(clickOnFinishLoc).click();
	  }
}
