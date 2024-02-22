package com.DemoWebShop.testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DemoWebShop.genericlibraries.BaseTest;

public class Password {

	public Password(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
@FindBy(id="Password")
WebElement PasswordTextField;

 public void enterPassword(String Password) {
	 
	PasswordTextField.sendKeys("Password");
 
 }
		
	}
