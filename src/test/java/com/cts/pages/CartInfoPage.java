package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartInfoPage {

	private static By firstNameLoc=By.id("first-name");
	private static By lastNameLoc=By.id("last-name");
	private static By postalLoc=By.id("postal-code");
	private static By clickOnContinueloc =By.xpath("//input[@value='CONTINUE']");
	    public static void enterFirstName(WebDriver driver,String firstname)
	{
	driver.findElement(firstNameLoc).sendKeys(firstname);
	}
	    public static void enterLastname(WebDriver driver,String lastName)
	{
	driver.findElement(lastNameLoc).sendKeys(lastName);
	}
	    public static void enterPostalCode(WebDriver driver,String postalcode)
	{
	driver.findElement( postalLoc).sendKeys(postalcode);
	}
	    public static void clickOnContinue(WebDriver driver)
	{
	driver.findElement(clickOnContinueloc).click();
	}
}
