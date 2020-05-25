package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinishPage {

	private static By getTextLoc =By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");
	 public static String getTextFromFinish(WebDriver driver)
	 {
	String actualText=driver.findElement(getTextLoc).getText();
	return actualText;
	 }
}
