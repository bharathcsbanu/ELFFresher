package com.DemoWebShop.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends BasePage {

	public WelcomePage(WebDriver driver) {
	super(driver);
		
	}
		@FindBy(partialLinkText = "Log in")
		WebElement loginlink;
		
		public void clickLogin() {
			loginlink.click();
		}

	}


