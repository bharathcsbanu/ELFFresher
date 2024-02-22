package com.DemoWebShop.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
public HomePage(WebDriver driver) {
	super   (driver);
}
@FindBy(xpath = "//div[@class='header-links']//a[@class='account']")
private WebElement loggedInEmailIDlink;

public void clickEmailIDAccount() {
	loggedInEmailIDlink.click();
}
public WebElement getLoggedInEmailIDLink() {
return	loggedInEmailIDlink;
}
public WebElement getlogoutLink() {
	return getlogoutLink();
	
}
	public void setloggedInEmail

	
}
}
