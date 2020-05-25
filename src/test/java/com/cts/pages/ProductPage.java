package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

	private static By addToCartLoc =By.xpath("(//button[text()='ADD TO CART'])[3]");
	private static By clickOnAddToCartLoc =By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']");
	public static void addToCart(WebDriver driver)
	{
	driver.findElement(addToCartLoc).click();
	}
	public static void clickOnAddToCart(WebDriver driver)
	{
	driver.findElement(clickOnAddToCartLoc).click();
	}
}
