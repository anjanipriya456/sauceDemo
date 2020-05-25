package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private static By userNameLoc = By.id("user-name");
	private static By passwordLoc = By.id("password");
	private static By loginLoc =By.xpath("//input[@value='LOGIN']");
	private static By invalidTextloc =By.xpath("//button[@class='error-button']");
	public static void enterUserName(WebDriver driver,String username)
	{
	driver.findElement(userNameLoc).sendKeys(username);
	}
	public static void enterPassword(WebDriver driver,String password)
	{
	driver.findElement(passwordLoc).sendKeys("secret_sauce");
	}
	 public static void clickOnlogin(WebDriver driver)
	{
	driver.findElement(loginLoc).click();
	}
	 public static String invalidText(WebDriver driver)
	 {
	String actualText= driver.findElement(invalidTextloc).getText();
	return actualText;
	 }
}
