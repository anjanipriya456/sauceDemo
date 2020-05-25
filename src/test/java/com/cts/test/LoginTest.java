package com.cts.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cts.base.LaunchWebDriver;
import com.cts.pages.CartInfoPage;
import com.cts.pages.CheckOutPage;
import com.cts.pages.FinishPage;
import com.cts.pages.LoginPage;
import com.cts.pages.ProductPage;
import com.cts.pages.YourCartPage;
import com.cts.utils.ExcelUtils;

public class LoginTest extends LaunchWebDriver {

	
	@DataProvider
	public String[][] RegisterData() throws IOException {
		String[][] main = ExcelUtils.getSheetIntoStringArray("src/test/resources/resources/SauceDemo.xlsx", "SauceTest");
		return main;
	}

	@Test(dataProvider = "RegisterData")
	public void registrationTest(String username,String password,String firstname,String lastname,String postalcode,String expected)
	{
	       //user name
	LoginPage.enterUserName(driver,username);
	//password
	LoginPage.enterPassword(driver,password);
	//login
	LoginPage.clickOnlogin(driver);
	//add item in the cart
	ProductPage.addToCart(driver);
	//click on add to Cart
	ProductPage.clickOnAddToCart(driver);
	//click on checkout
	YourCartPage.clicOnCheckout(driver);
	        //CHECK OUT INFORMATION
	//enter first name
	CartInfoPage.enterFirstName(driver, firstname);
	//enter last name
	CartInfoPage.enterLastname(driver, lastname);
	//enter postal code
	CartInfoPage.enterPostalCode(driver,postalcode);
	//click on continue
	CartInfoPage.clickOnContinue(driver);
	//click on finish
	CheckOutPage.clickOnFinish(driver);
	//get text
	String actualText=FinishPage.getTextFromFinish(driver);
	
	System.out.println(actualText);
	
	Assert.assertEquals(actualText, expected);
	
	
	}
//	@Test
//	public void invalidCredentialTest() {
//	//enter user name
//	LoginPage.enterUserName(driver, "standard_user12");
//	//enter password
//	LoginPage.enterPassword(driver,"secret_sauce2");
//	//enter login
//	LoginPage.clickOnlogin(driver);
//	//get invalid login text
//	System.out.println(LoginPage.invalidText(driver));
	}

