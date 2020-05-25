package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage {

	private static By clickOnCheckOutLoc =By.linkText("CHECKOUT");
	 public static void clicOnCheckout(WebDriver driver)
	{
	driver.findElement(clickOnCheckOutLoc).click();
	}

}
