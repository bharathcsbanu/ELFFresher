package com.DemoWebShop.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Email  {
	public Email(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
@FindBy(id="Email")
WebElement emailTextField;

 public void enterEmail(String email) {
	 
	emailTextField.sendKeys(email);
 

}
}